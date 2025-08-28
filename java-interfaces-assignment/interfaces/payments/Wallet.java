package interfaces.payments;

public class Wallet implements DigitalPayment {
    private final String provider;
    public Wallet(String provider) { this.provider = provider; }
    @Override public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via " + provider + " Wallet");
    }
}
