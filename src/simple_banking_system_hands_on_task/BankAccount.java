package simple_banking_system_hands_on_task;
// Abstract Class
abstract class BankAccount implements AccountOperations
{
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public void showAccountNumber() {
        System.out.println("Account Number: " + accountNumber);
    }

    public abstract void showAccountType();
}
