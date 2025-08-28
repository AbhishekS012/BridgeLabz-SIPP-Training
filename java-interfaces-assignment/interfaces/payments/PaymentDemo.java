package interfaces.payments;

public class PaymentDemo {
    public static void main(String[] args) {
        DigitalPayment upi = new UPI("abhishek@upi");
        DigitalPayment cc = new CreditCard("**** **** **** 1234");
        DigitalPayment wal = new Wallet("PayNow");
        upi.pay(299.0); cc.pay(1250.5); wal.pay(99.0);
    }
}
