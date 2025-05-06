package Level_6_data_processing_and_ransformations;

// Problem31: Given a list of transactions (with amount and type), calculate the total amount for type "DEBIT" using streams.
import java.util.*;
import java.util.stream.*;

public class Problem31
{
    static class Transaction
    {
        private double amount;
        private String type;

        public Transaction(double amount, String type)
        {
            this.amount = amount;
            this.type = type;
        }

        public double getAmount()
        {
            return amount;
        }

        public String getType()
        {
            return type;
        }
    }

    public static void main(String[] args)
    {
        List<Transaction> transactions = Arrays.asList(
                new Transaction(100.0, "DEBIT"),
                new Transaction(50.5, "CREDIT"),
                new Transaction(200.0, "DEBIT"),
                new Transaction(30.0, "DEBIT")
        );

        double totalDebit = transactions.stream()
                .filter(t -> "DEBIT".equals(t.getType()))    // filter only DEBIT transactions
                .mapToDouble(Transaction::getAmount)          // extract amounts
                .sum();                                       // sum them up

        System.out.println("Total DEBIT amount: " + totalDebit);
    }
}
