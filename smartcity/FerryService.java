package smartcity;

import java.time.LocalDateTime;

public class FerryService extends BaseService {
    public FerryService(String id, String route, double baseFarePerKm, LocalDateTime departureTime, boolean active, int capacity) {
        super(id, "Ferry", route, baseFarePerKm, departureTime, active, capacity);
    }
}