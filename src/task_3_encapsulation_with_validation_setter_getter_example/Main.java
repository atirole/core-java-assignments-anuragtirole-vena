package task_3_encapsulation_with_validation_setter_getter_example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        String accNum = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(name, accNum, balance);

        System.out.println("\n=== Account Created ===");
        account.displayAccount();

        // Try setting a negative balance
        System.out.println("\nTrying to update balance to -100...");
        account.setBalance(-100); // Will trigger validation

        System.out.println("\nUpdated Account Details:");
        account.displayAccount();

        sc.close();
    }
}

