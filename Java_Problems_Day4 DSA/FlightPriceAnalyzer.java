
// DSA - Moderate: Flight Price Analyzer using Comparator + Merge Sort
import java.util.*;

class Flight {
    String flightNo;
    int price, duration;
    Flight(String flightNo, int price, int duration) {
        this.flightNo = flightNo;
        this.price = price;
        this.duration = duration;
    }
}

class FlightComparator implements Comparator<Flight> {
    public int compare(Flight f1, Flight f2) {
        if (f1.price == f2.price) return f1.duration - f2.duration;
        return f1.price - f2.price;
    }
}

public class FlightPriceAnalyzer {
    public static void main(String[] args) {
        List<Flight> flights = Arrays.asList(
            new Flight("AI101", 5000, 120),
            new Flight("AI102", 4000, 180),
            new Flight("AI103", 5000, 100)
        );

        flights.sort(new FlightComparator());
        for (Flight f : flights) {
            System.out.println(f.flightNo + " - Price: " + f.price + ", Duration: " + f.duration);
        }
    }
}
