package task_2_bank_account_synchronization;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount
{
    private final int accountId;
    private double balance;
    private final ReentrantLock lock = new ReentrantLock();
    private final List<Transaction> transactions = new ArrayList<>();

    public BankAccount(int accountId, double initialBalance)
    {
        this.accountId = accountId;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        lock.lock();
        try
        {
            balance += amount;
            transactions.add(new Transaction("Deposit", amount));
        }
        finally
        {
            lock.unlock();
        }
    }

    public boolean withdraw(double amount)
    {
        lock.lock();
        try
        {
            if (amount > balance)
            {
                transactions.add(new Transaction("Failed Withdrawal", amount));
                return false;
            }
            balance -= amount;
            transactions.add(new Transaction("Withdrawal", amount));
            return true;
        }
        finally
        {
            lock.unlock();
        }
    }

    public double getBalance()
    {
        lock.lock();
        try
        {
            return balance;
        }
        finally
        {
            lock.unlock();
        }
    }

    public void printTransactions()
    {
        System.out.println("Transactions for Account #" + accountId + ":");
        for (Transaction t : transactions)
        {
            System.out.println(t);
        }
    }
}
