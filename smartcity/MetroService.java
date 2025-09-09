package smartcity;

import java.time.LocalDateTime;

public class MetroService extends BaseService {
    public MetroService(String id, String route, double baseFarePerKm, LocalDateTime departureTime, boolean active, int capacity) {
        super(id, "Metro", route, baseFarePerKm, departureTime, active, capacity);
    }
}