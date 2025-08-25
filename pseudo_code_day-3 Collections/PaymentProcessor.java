
// Collections - Moderate: Payment Processor using Generics
class Transaction<T> {
    T paymentMethod;
    Transaction(T paymentMethod) { this.paymentMethod = paymentMethod; }

    void process() {
        System.out.println("Processing payment through: " + paymentMethod);
    }
}

public class PaymentProcessor {
    public static void main(String[] args) {
        Transaction<String> upi = new Transaction<>("UPI");
        Transaction<String> card = new Transaction<>("Card");
        Transaction<String> netBanking = new Transaction<>("NetBanking");

        upi.process();
        card.process();
        netBanking.process();
    }
}
