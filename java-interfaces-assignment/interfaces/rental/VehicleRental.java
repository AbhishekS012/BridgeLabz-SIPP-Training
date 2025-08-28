package interfaces.rental;

public interface VehicleRental {
    void rent(String customerName, int days);
    void returnVehicle(String customerName);
}
