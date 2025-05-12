package Exception_Handling_Assignments.Task_5_Partial_transaction_rollback_on_failure;

public class BankAccount
{
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance)
    {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount)
    {
        balance += amount;
    }

    public void withdraw(double amount) throws IllegalArgumentException
    {
        if (amount > balance)
        {
            throw new IllegalArgumentException("Insufficient balance");
        }
        balance -= amount;
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }

    public double getBalance()
    {
        return balance;
    }
}
