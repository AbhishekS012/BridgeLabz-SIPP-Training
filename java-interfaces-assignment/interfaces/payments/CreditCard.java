package interfaces.payments;

public class CreditCard implements DigitalPayment {
    private final String maskedCard;
    public CreditCard(String maskedCard) { this.maskedCard = maskedCard; }
    @Override public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via Credit Card " + maskedCard);
    }
}
