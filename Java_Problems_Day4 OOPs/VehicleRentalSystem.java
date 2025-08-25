
// OOPs - Difficult: Vehicle Rental System with Factory Pattern
interface Rentable {
    void rent();
}

abstract class Vehicle implements Rentable {
    String model;
    Vehicle(String model) { this.model = model; }
}

class Car extends Vehicle {
    Car(String model) { super(model); }
    public void rent() { System.out.println("Car rented: " + model); }
}

class Bike extends Vehicle {
    Bike(String model) { super(model); }
    public void rent() { System.out.println("Bike rented: " + model); }
}

class VehicleFactory {
    public static Vehicle createVehicle(String type, String model) {
        if (type.equalsIgnoreCase("car")) return new Car(model);
        else if (type.equalsIgnoreCase("bike")) return new Bike(model);
        else return null;
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle v1 = VehicleFactory.createVehicle("car", "Honda City");
        Vehicle v2 = VehicleFactory.createVehicle("bike", "Royal Enfield");

        v1.rent();
        v2.rent();
    }
}
