package Assignment1.Question4;

public class BankAccount {

    private final int accountNumber;
    private final String accountHolderName;

    public enum accountType {
        SAVINGS("SAVINGS"), CHECKING("CHECKING");
        private String span;

        accountType(String string) {
            span = string;
        }
    }

    private accountType type;
    private double balance;

    protected double getBalance(){
        return this.balance;
    }
    protected void setBalance(double newBal){
        this.balance = newBal;
    }
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
            System.out.println("Insufficient Balance");
        }
    }

    public void getAccountInfo() {
        System.out.printf("Account Number: %d, Account Holder: %s, Account Type: %s, Balance: $%.2f %n", this.accountNumber, this.accountHolderName, this.type.span, this.balance);
    }

    public void transfer(double amount,  BankAccount destinationAccount) {
        if (amount <= this.balance && amount > 0) {
            this.withdraw(amount);
            destinationAccount.deposit(amount);
            System.out.printf("Transferring $%.2f to %s %n", amount, destinationAccount.accountHolderName);
        } else {
            System.out.println("Insufficient Balance");
        }

    }


}