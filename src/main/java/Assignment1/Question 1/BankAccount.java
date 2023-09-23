package Assignment1;

public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private enum accountType {SAVINGS, CHECKING}
    accountType type;
    public BankAccount(int accountNumber, String accountHolderName, double initialBalance, accountType type){
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
    public void withdraw(double amount){
        if (amount > 0 && amount <= this.balance){
            this.balance = this.balance - amount;
            System.out.printf("Current Balance is: %f %n", this.balance);
        } else {
            System.out.println("Invalid Amount");
        }
    }
}