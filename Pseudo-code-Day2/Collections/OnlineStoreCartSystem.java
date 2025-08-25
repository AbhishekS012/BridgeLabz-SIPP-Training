
// Collections - Easy: Online Store Cart System
import java.util.*;

class Item {
    String name;
    double price;
    Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class Cart {
    List<Item> items = new ArrayList<>();
    <T extends Item> void addItem(T item) { items.add(item); }
    double totalPrice() {
        return items.stream().mapToDouble(i -> i.price).sum();
    }
}

public class OnlineStoreCartSystem {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.addItem(new Item("Book", 200));
        cart.addItem(new Item("Pen", 20));
        System.out.println("Total Price: " + cart.totalPrice());
    }
}
