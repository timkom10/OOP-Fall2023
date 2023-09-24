package Assignment1.Question3;

public class BankAccount {
    private enum accountType {SAVINGS, CHECKING}

    private final int accountNumber;
    private final String accountHolderName;
    accountType type;
    private double balance;

    public BankAccount(int accountNumber, String accountHolderName, double initialBalance, accountType type) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        this.type = type;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance = amount + this.balance;
            System.out.printf("Current Balance is: %f %n", this.balance);
        } else {
            System.out.println("Invalid Amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance = this.balance - amount;
            System.out.printf("Current Balance is: %f %n", this.balance);
        } else {
            System.out.println("Invalid Amount");
        }
    }

    public void getAccountInfo() {
        System.out.printf("Account Number: %d, Account Holder: %s, Account Type: %s, Balance: $%.2f", this.accountNumber, this.accountHolderName, this.type, this.balance);
    }

    public void main() {
        BankAccount account = new BankAccount(12345, "John Doe", 1000, accountType.SAVINGS);
        account.deposit(500);
        account.withdraw(300);
        account.getAccountInfo();
    }

}