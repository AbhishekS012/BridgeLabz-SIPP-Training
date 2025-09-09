package smartcity;

import java.time.LocalDateTime;

public class AmbulanceService extends BaseService implements EmergencyService {
    public AmbulanceService(String id, String route, double baseFarePerKm, LocalDateTime departureTime, boolean active, int capacity) {
        super(id, "Ambulance", route, baseFarePerKm, departureTime, active, capacity);
    }
}