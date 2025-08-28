package interfaces.rental;

public class RentalDemo {
    public static void main(String[] args) {
        VehicleRental car = new Car();
        VehicleRental bike = new Bike();
        VehicleRental bus = new Bus();
        car.rent("Asha", 2); bike.rent("Ravi", 1); bus.rent("Team", 3);
        car.returnVehicle("Asha"); bike.returnVehicle("Ravi"); bus.returnVehicle("Team");
    }
}
