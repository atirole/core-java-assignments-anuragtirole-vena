package simple_banking_system_hands_on_task;
import java.util.Scanner;
//  Main Application
public class BankApp
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = null;

        System.out.println("=== Welcome to Simple Bank System ===");
        System.out.print("Enter Account Number: ");
        String accNo = scanner.nextLine();

        System.out.print("Enter Initial Balance: ");
        double initBal = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        System.out.print("Choose Account Type (1 for Savings, 2 for Current): ");
        int accType = scanner.nextInt();
        scanner.nextLine();

        if (accType == 1) {
            account = new SavingsAccount(accNo, initBal);
        } else if (accType == 2) {
            account = new CurrentAccount(accNo, initBal);
        } else {
            System.out.println("Invalid account type. Exiting...");
            return;
        }

        boolean running = true;
        while (running) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. View Balance");
            System.out.println("4. Show Account Number");
            System.out.println("5. Show Account Type");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    scanner.nextLine();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    account.displayBalance();
                    break;

                case 4:
                    account.showAccountNumber();
                    break;

                case 5:
                    account.showAccountType();
                    break;

                case 6:
                    running = false;
                    System.out.println("Thank you for using the banking system!");
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }
}

