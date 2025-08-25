
// OOPs - Moderate: Banking Portal
class Account {
    String accNo;
    double balance;

    Account(String accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", Balance: " + balance);
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}

class SavingAccount extends Account {
    SavingAccount(String accNo, double balance) { super(accNo, balance); }

    @Override
    void withdraw(double amount) {
        if (amount > 5000) {
            System.out.println("Savings withdrawal limit exceeded!");
        } else {
            super.withdraw(amount);
        }
    }
}

class CurrentAccount extends Account {
    CurrentAccount(String accNo, double balance) { super(accNo, balance); }

    @Override
    void withdraw(double amount) {
        super.withdraw(amount); // No special restriction
    }
}

public class BankingPortal {
    public static void main(String[] args) {
        Account sa = new SavingAccount("SA123", 10000);
        sa.withdraw(4000);
        sa.withdraw(6000);

        Account ca = new CurrentAccount("CA123", 20000);
        ca.withdraw(15000);
    }
}
