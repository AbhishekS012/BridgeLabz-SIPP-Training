package smartcity;

import java.time.LocalDateTime;

public class BusService extends BaseService {
    public BusService(String id, String route, double baseFarePerKm, LocalDateTime departureTime, boolean active, int capacity) {
        super(id, "Bus", route, baseFarePerKm, departureTime, active, capacity);
    }
}