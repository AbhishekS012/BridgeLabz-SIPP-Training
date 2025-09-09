package smartcity;

@FunctionalInterface
public interface FareCalculator {
    double calculateFare(TransportService service, double distanceKm);
}