package Exception_Handling_Assignments.Task_5_Partial_transaction_rollback_on_failure;

import java.util.HashMap;
import java.util.Map;

public class BankService
{
    private Map<String, BankAccount> accounts = new HashMap<>();

    public void addAccount(BankAccount account)
    {
        accounts.put(account.getAccountNumber(), account);
    }

    public void transfer(String fromAcc, String toAcc, double amount)
    {
        BankAccount sender = accounts.get(fromAcc);
        BankAccount receiver = accounts.get(toAcc);

        try
        {
            if (sender == null)
            {
                throw new IllegalArgumentException("Sender account not found");
            }

            // Step 1: Withdraw from sender
            sender.withdraw(amount);

            // Step 2: Simulate error if receiver is invalid
            if (receiver == null)
            {
                throw new IllegalArgumentException("Receiver account not found");
            }

            // Step 3: Deposit into receiver
            receiver.deposit(amount);

            System.out.println("Transfer successful!");
        }
        catch (Exception e)
        {
            // Rollback if withdrawal succeeded but deposit failed
            if (sender != null)
            {
                sender.deposit(amount); // Rollback
                System.err.println("Transfer failed. Rolled back sender's withdrawal.");
            }
            System.err.println("Error: " + e.getMessage());
        }
    }

    public void printBalances()
    {
        for (BankAccount acc : accounts.values())
        {
            System.out.println("Account " + acc.getAccountNumber() + " balance: ₹" + acc.getBalance());
        }
    }
}
