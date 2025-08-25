
// Collections - Difficult: Digital Wallet Transactions Report
import java.util.*;
import java.util.stream.*;
import java.time.*;

class Transaction {
    String merchant;
    LocalDate date;
    double amount;
    Transaction(String merchant, LocalDate date, double amount) {
        this.merchant = merchant;
        this.date = date;
        this.amount = amount;
    }
}

public class DigitalWalletTransactionsReport {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
            new Transaction("Amazon", LocalDate.of(2024, 1, 10), 5000),
            new Transaction("Flipkart", LocalDate.of(2024, 1, 15), 3000),
            new Transaction("Amazon", LocalDate.of(2024, 2, 5), 2000),
            new Transaction("Flipkart", LocalDate.of(2024, 2, 25), 7000)
        );

        Map<String, Map<Integer, Double>> report =
            transactions.stream().collect(Collectors.groupingBy(
                t -> t.merchant,
                Collectors.groupingBy(t -> t.date.getMonthValue(),
                    Collectors.summingDouble(t -> t.amount)
                )
            ));

        report.forEach((merchant, monthly) -> {
            System.out.println("Merchant: " + merchant);
            monthly.forEach((month, total) ->
                System.out.println(" Month: " + month + " Total: " + total));
        });
    }
}
