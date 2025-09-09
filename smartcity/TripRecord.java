package smartcity;

import java.time.LocalDateTime;

public class TripRecord {
    public final String route;
    public final double fare;
    public final LocalDateTime time;
    public TripRecord(String route, double fare, LocalDateTime time) {
        this.route = route;
        this.fare = fare;
        this.time = time;
    }
    public boolean isPeak() {
        int h = time.getHour();
        return (h>=8 && h<=10) || (h>=17 && h<=20);
    }
    public String getRoute() { return route; }
    public double getFare() { return fare; }
    public LocalDateTime getTime() { return time; }
    public String toString() { return route + ":" + fare + "@" + time; }
}