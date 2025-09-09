package smartcity;

import java.time.LocalDateTime;

public class FireService extends BaseService implements EmergencyService {
    public FireService(String id, String route, double baseFarePerKm, LocalDateTime departureTime, boolean active, int capacity) {
        super(id, "Fire", route, baseFarePerKm, departureTime, active, capacity);
    }
}