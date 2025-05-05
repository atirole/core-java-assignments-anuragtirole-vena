package task_2_bank_account_synchronization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        // Create multiple bank accounts
        BankAccount account1 = new BankAccount(1, 1000.0);
        BankAccount account2 = new BankAccount(2, 2000.0);
        BankAccount account3 = new BankAccount(3, 3000.0);

        // Use an ExecutorService to simulate multiple users
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Simulate deposits and withdrawals for each account
        executor.submit(() -> {
            for (int i = 0; i < 20; i++)
            {
                account1.deposit(50);
                account1.withdraw(30);
            }
        });

        executor.submit(() -> {
            for (int i = 0; i < 20; i++)
            {
                account2.deposit(40);
                account2.withdraw(20);
            }
        });

        executor.submit(() -> {
            for (int i = 0; i < 20; i++)
            {
                account3.deposit(30);
                account3.withdraw(10);
            }
        });

        // Shut down the executor and wait for threads to finish
        executor.shutdown();
        executor.awaitTermination(10, TimeUnit.SECONDS);

        // Output final balances and transaction logs for each account
        System.out.printf("Final Balance for Account #1: $%.2f%n", account1.getBalance());
        account1.printTransactions();

        System.out.printf("Final Balance for Account #2: $%.2f%n", account2.getBalance());
        account2.printTransactions();

        System.out.printf("Final Balance for Account #3: $%.2f%n", account3.getBalance());
        account3.printTransactions();
    }
}
