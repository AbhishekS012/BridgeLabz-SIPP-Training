package markerinterfaces;

public class CloningDemo {
    public static void main(String[] args) {
        PrototypeModel original = new PrototypeModel("InvoiceTemplate", 1);
        PrototypeModel cloned = original.clone();
        System.out.println("Original: " + original);
        System.out.println("Cloned  : " + cloned);
        System.out.println("Same object? " + (original == cloned));
    }
}
