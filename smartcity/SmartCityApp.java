package smartcity;

import java.time.LocalDateTime;
import java.util.*;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class SmartCityApp {
    public static void main(String[] args) {
        List<TransportService> services = Arrays.asList(
            new BusService("B101","A1",0.7, LocalDateTime.now().plusMinutes(20), true, 50),
            new BusService("B102","A1",0.6, LocalDateTime.now().plusMinutes(5), true, 50),
            new MetroService("M201","M-Green",0.9, LocalDateTime.now().plusMinutes(10), true, 200),
            new TaxiService("T301","A1",12.0, LocalDateTime.now().plusMinutes(3), true, 4),
            new TaxiService("T302","A2",11.0, LocalDateTime.now().plusMinutes(8), true, 4),
            new FerryService("F401","River-Line",1.2, LocalDateTime.now().plusMinutes(30), true, 120),
            new AmbulanceService("EM501","City",0.0, LocalDateTime.now(), true, 2),
            new FireService("EM601","City",0.0, LocalDateTime.now(), true, 6)
        );
        double distance = GeoUtils.calculateDistance(28.6139,77.2090,28.4595,77.0266);
        FareCalculator fareCalc = (svc, dist) -> svc.getFare() * dist;
        BiFunction<Double, Double, Double> distFn = GeoUtils::calculateDistance;
        double altDistance = distFn.apply(28.6139, 77.2090);
        List<TransportService> filtered = services.stream()
            .filter(TransportService::isActive)
            .filter(s -> s.getRoute().equals("A1"))
            .sorted(Comparator.comparing(TransportService::getDepartureTime).thenComparing(TransportService::getFare))
            .collect(Collectors.toList());
        filtered.forEach(TransportService::printServiceDetails);
        services.stream().filter(TransportService::isActive).forEach(TransportService::printServiceDetails);
        List<TripRecord> trips = Arrays.asList(
            new TripRecord("A1", fareCalc.calculateFare(services.get(0), distance), LocalDateTime.now().minusHours(1)),
            new TripRecord("A1", fareCalc.calculateFare(services.get(1), distance), LocalDateTime.now().minusHours(5)),
            new TripRecord("M-Green", fareCalc.calculateFare(services.get(2), distance), LocalDateTime.now().minusHours(2)),
            new TripRecord("A2", fareCalc.calculateFare(services.get(4), distance), LocalDateTime.now().minusHours(9)),
            new TripRecord("River-Line", fareCalc.calculateFare(services.get(5), distance), LocalDateTime.now().minusHours(3))
        );
        Map<String, List<TripRecord>> byRoute = trips.stream().collect(Collectors.groupingBy(TripRecord::getRoute));
        Map<Boolean, List<TripRecord>> peakPartition = trips.stream().collect(Collectors.partitioningBy(TripRecord::isPeak));
        DoubleSummaryStatistics fareStats = trips.stream().collect(Collectors.summarizingDouble(TripRecord::getFare));
        System.out.println(byRoute);
        System.out.println(peakPartition);
        System.out.println(fareStats);
        List<TransportService> emergencies = services.stream().filter(s -> s instanceof EmergencyService).collect(Collectors.toList());
        emergencies.forEach(s -> System.out.println("PRIORITY " + s));
    }
}