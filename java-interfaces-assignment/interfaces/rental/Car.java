package interfaces.rental;

public class Car implements VehicleRental {
    @Override public void rent(String customerName, int days) {
        System.out.println("Car rented to " + customerName + " for " + days + " days");
    }
    @Override public void returnVehicle(String customerName) {
        System.out.println("Car returned by " + customerName);
    }
}
