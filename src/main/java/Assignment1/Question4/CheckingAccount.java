package Assignment1.Question4;


public class CheckingAccount extends BankAccount {
    private double overdraftLimit;
    public CheckingAccount(int accountNumber, String accountHolderName, double initialBalance, double overdraftLimit) {
        super(accountNumber, accountHolderName, initialBalance, accountType.CHECKING);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance + this.overdraftLimit) {
            this.balance = this.balance - amount;
        }
        else{
            System.out.println("Insufficient funds");
        }
    }
    public void displayOverdraftLimit(){
        System.out.printf("The current overdraft limit of this account is $%.2f %n", this.overdraftLimit);
    }
}
