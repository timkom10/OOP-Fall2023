package Assignment1.Question4;


public class CheckingAccount extends BankAccount {
    private double overdraftLimit;
    public CheckingAccount(int accountNumber, String accountHolderName, double initialBalance, accountType type, double overdraftLimit) {
        super(accountNumber, accountHolderName, initialBalance, type);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        double balance = this.getBalance();
        if (amount > 0 && amount <= balance + this.overdraftLimit) {
            balance = balance - amount;
            this.setBalance(balance);
        }
        else{
            System.out.println("Insufficient funds");
        }
    }
    public void displayOverdraftLimit(){
        System.out.printf("The current overdraft limit of this account is $%.2f %n", this.overdraftLimit);
    }
}
