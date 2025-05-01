package task_10_bank_transaction_log;

import java.time.LocalDateTime;

public class Transaction
{
    private String transactionId;
    private LocalDateTime timestamp;
    private double amount;
    private String type;

    // Constructor
    public Transaction(String transactionId, LocalDateTime timestamp, double amount, String type)
    {
        this.transactionId = transactionId;
        this.timestamp = timestamp;
        this.amount = amount;
        this.type = type;
    }

    // Getters
    public String getTransactionId()
    {
        return transactionId;
    }

    public LocalDateTime getTimestamp()
    {
        return timestamp;
    }

    public double getAmount()
    {
        return amount;
    }

    public String getType()
    {
        return type;
    }

    @Override
    public String toString()
    {
        return "Transaction ID: " + transactionId + ", Type: " + type + ", Amount: " + amount + ", Date: " + timestamp;
    }
}
