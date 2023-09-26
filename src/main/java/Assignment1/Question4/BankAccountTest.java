package Assignment1.Question4;

public class BankAccountTest {
    public void main() {
        BankAccount account = new BankAccount(12345, "John Doe", 1000, BankAccount.accountType.SAVINGS);
        account.deposit(500);
        account.withdraw(300);
        account.getAccountInfo();

        BankAccount notJohn = new BankAccount(54321, "Jane Doe", 200, BankAccount.accountType.SAVINGS);
        account.transfer(100, notJohn);

        account.getAccountInfo();
        notJohn.getAccountInfo();

        CheckingAccount newJohn = new CheckingAccount(12345, "John Doe", 1000, BankAccount.accountType.CHECKING, 1);
    }
}
