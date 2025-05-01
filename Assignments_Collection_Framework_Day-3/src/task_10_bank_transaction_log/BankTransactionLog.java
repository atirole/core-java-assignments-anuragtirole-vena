package task_10_bank_transaction_log;

import java.time.LocalDateTime;
import java.util.*;

public class BankTransactionLog
{
    private Map<String, List<Transaction>> accountTransactions;

    // Constructor
    public BankTransactionLog()
    {
        accountTransactions = new HashMap<>();
    }

    // Add a transaction for an account
    public void addTransaction(String accountNumber, Transaction transaction)
    {
        accountTransactions
                .computeIfAbsent(accountNumber, k -> new ArrayList<>())  // Initialize List if not present
                .add(transaction);
    }

    // Generate statement for an account sorted by transaction time
    public void generateStatement(String accountNumber)
    {
        if (!accountTransactions.containsKey(accountNumber))
        {
            System.out.println("No transactions found for account: " + accountNumber);
            return;
        }

        List<Transaction> transactions = accountTransactions.get(accountNumber);

        // Sort transactions by timestamp
        transactions.sort(Comparator.comparing(Transaction::getTimestamp));

        System.out.println("Transaction Statement for Account: " + accountNumber);
        for (Transaction transaction : transactions)
        {
            System.out.println(transaction);
        }
    }
}
