package interfaces.rental;

public class Bus implements VehicleRental {
    @Override public void rent(String customerName, int days) {
        System.out.println("Bus rented to " + customerName + " for " + days + " days (with driver)");
    }
    @Override public void returnVehicle(String customerName) {
        System.out.println("Bus returned by " + customerName);
    }
}
