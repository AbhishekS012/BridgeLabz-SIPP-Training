package smartcity;

import java.time.LocalDateTime;

public abstract class BaseService implements TransportService {
    protected final String id;
    protected final String type;
    protected final String route;
    protected final double baseFarePerKm;
    protected final LocalDateTime departureTime;
    protected final boolean active;
    protected final int capacity;
    public BaseService(String id, String type, String route, double baseFarePerKm, LocalDateTime departureTime, boolean active, int capacity) {
        this.id = id;
        this.type = type;
        this.route = route;
        this.baseFarePerKm = baseFarePerKm;
        this.departureTime = departureTime;
        this.active = active;
        this.capacity = capacity;
    }
    public String getId() { return id; }
    public String getType() { return type; }
    public String getRoute() { return route; }
    public double getFare() { return baseFarePerKm; }
    public LocalDateTime getDepartureTime() { return departureTime; }
    public boolean isActive() { return active; }
    public int getCapacity() { return capacity; }
    public String toString() { return type + "(" + id + "," + route + "," + baseFarePerKm + "," + departureTime + "," + active + "," + capacity + ")"; }
}