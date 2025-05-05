package task_2_bank_account_synchronization;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction
{
    private final String type;
    private final double amount;
    private final String timestamp;

    public Transaction(String type, double amount)
    {
        this.type = type;
        this.amount = amount;
        this.timestamp = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));
    }

    @Override
    public String toString()
    {
        return "[" + timestamp + "] " + type + ": " + amount;
    }
}

