
// OOPs - Moderate: Food Delivery System (Composition)
class Customer {
    String name;
    Customer(String name) { this.name = name; }
}

class Restaurant {
    String name;
    Restaurant(String name) { this.name = name; }
}

class DeliveryBoy {
    String name;
    DeliveryBoy(String name) { this.name = name; }
}

class Order {
    Customer customer;
    Restaurant restaurant;
    DeliveryBoy deliveryBoy;

    Order(Customer c, Restaurant r, DeliveryBoy d) {
        this.customer = c;
        this.restaurant = r;
        this.deliveryBoy = d;
    }

    void showOrder() {
        System.out.println("Order placed by: " + customer.name);
        System.out.println("Restaurant: " + restaurant.name);
        System.out.println("Delivered by: " + deliveryBoy.name);
    }
}

public class FoodDeliverySystem {
    public static void main(String[] args) {
        Customer c = new Customer("Rahul");
        Restaurant r = new Restaurant("Pizza Hut");
        DeliveryBoy d = new DeliveryBoy("Amit");
        Order order = new Order(c, r, d);
        order.showOrder();
    }
}
