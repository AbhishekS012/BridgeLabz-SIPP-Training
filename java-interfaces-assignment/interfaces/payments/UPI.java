package interfaces.payments;

public class UPI implements DigitalPayment {
    private final String id;
    public UPI(String id) { this.id = id; }
    @Override public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via UPI: " + id);
    }
}
