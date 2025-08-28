package interfaces.rental;

public class Bike implements VehicleRental {
    @Override public void rent(String customerName, int days) {
        System.out.println("Bike rented to " + customerName + " for " + days + " days");
    }
    @Override public void returnVehicle(String customerName) {
        System.out.println("Bike returned by " + customerName);
    }
}
