// Encapsulation: wrapping data (fields) and methods together,
// restricting direct access to fields using private + getters/setters
class BankAccount {
    private String accountHolder;
    private double balance;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter methods
    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // Setter method with validation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid or insufficient balance.");
        }
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("John Doe", 1000.0);

        System.out.println("Account Holder: " + acc.getAccountHolder());
        System.out.println("Initial Balance: " + acc.getBalance());

        acc.deposit(500);
        acc.withdraw(200);
        acc.withdraw(5000); // insufficient balance

        System.out.println("Final Balance: " + acc.getBalance());
    }
}