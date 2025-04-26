package task_8_bank_account_this_keyword_example;

public class BankAccount
{
    private String name;
    private double balance;
    private String type;

    // Constructor using 'this' to resolve shadowing
    public BankAccount(String name, double balance, String type)
    {
        this.name = name;       // 'this.name' refers to the field, 'name' is the parameter
        this.balance = balance;
        this.type = type;
    }

    // Method to deposit money using 'this'
    public void deposit(double balance)
    {
        this.balance += balance;  // 'this.balance' is the field, 'balance' is the parameter
        System.out.println("Deposited: " + balance);
    }

    // Display account details
    public void displayAccountDetails()
    {
        System.out.println("Account Holder: " + name);
        System.out.println("Account Type: " + type);
        System.out.println("Account Balance: " + balance);
    }
}

