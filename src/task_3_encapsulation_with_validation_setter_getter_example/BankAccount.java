package task_3_encapsulation_with_validation_setter_getter_example;

public class BankAccount
{   // Private fields (data hiding)
    private String accountHolder;
    private double balance;
    private String accountNumber;

    // Constructor
    public BankAccount(String accountHolder, String accountNumber, double balance)
    {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        setBalance(balance);
    }
    // Getter method for accountHolder
    public String getAccountHolder()
    {
        return accountHolder;
    }
    // Setter method for accountHolder
    public void setAccountHolder(String accountHolder)
    {
        this.accountHolder = accountHolder;
    }
    // Getter method for balance

    public double getBalance()
    {
        return balance;
    }
    // Setter method for balance with validation
    public void setBalance(double balance)
    {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance! Balance cannot be negative.");
        }
    }
    // Getter method for accountNumber
    public String getAccountNumber()
    {
        return accountNumber;
    }
    // Setter method for accountNumber
    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }
    // Method to display account details
    public void displayAccount() {
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : $" + balance);
    }
}

