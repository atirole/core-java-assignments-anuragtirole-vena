package task_10_bank_transaction_log;

import java.time.LocalDateTime;

public class Main
{
    public static void main(String[] args)
    {
        // Create bank transaction log
        BankTransactionLog log = new BankTransactionLog();

        // Create some transactions for different accounts
        Transaction transaction1 = new Transaction("TXN001", LocalDateTime.of(2025, 5, 1, 10, 30), 1000.0, "Deposit");
        Transaction transaction2 = new Transaction("TXN002", LocalDateTime.of(2025, 5, 1, 14, 15), 200.0, "Withdrawal");
        Transaction transaction3 = new Transaction("TXN003", LocalDateTime.of(2025, 5, 2, 9, 45), 500.0, "Deposit");
        Transaction transaction4 = new Transaction("TXN004", LocalDateTime.of(2025, 5, 1, 16, 30), 150.0, "Deposit");

        // Add transactions to accounts
        log.addTransaction("A123", transaction1);
        log.addTransaction("A123", transaction2);
        log.addTransaction("A123", transaction3);
        log.addTransaction("A456", transaction4);

        // Generate statements for accounts
        log.generateStatement("A123");
        log.generateStatement("A456");
    }
}
