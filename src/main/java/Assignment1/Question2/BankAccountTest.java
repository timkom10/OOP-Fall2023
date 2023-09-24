package Assignment1.Question2;

import Assignment1.Question1.BankAccount;

public class BankAccountTest {
    public void main() {
        Assignment1.Question1.BankAccount account = new BankAccount(12345, "John Doe", 1000, BankAccount.accountType.SAVINGS);
        account.deposit(500);
        account.withdraw(300);
        account.getAccountInfo();
    }
}
