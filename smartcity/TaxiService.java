package smartcity;

import java.time.LocalDateTime;

public class TaxiService extends BaseService {
    public TaxiService(String id, String route, double baseFarePerKm, LocalDateTime departureTime, boolean active, int capacity) {
        super(id, "Taxi", route, baseFarePerKm, departureTime, active, capacity);
    }
}