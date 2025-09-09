package smartcity;

import java.time.LocalDateTime;

public interface TransportService {
    String getId();
    String getType();
    String getRoute();
    double getFare();
    LocalDateTime getDepartureTime();
    boolean isActive();
    default void printServiceDetails() {
        System.out.println(getType() + " " + getId() + " " + getRoute() + " " + getFare() + " " + getDepartureTime());
    }
}