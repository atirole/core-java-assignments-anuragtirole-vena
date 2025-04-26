package task_8_bank_account_this_keyword_example;

public class Main
{
    public static void main(String[] args)
    {
        BankAccount account1 = new BankAccount("Anurag Tirole", 5000.0, "Savings");

        account1.displayAccountDetails();
        account1.deposit(1500.0);
        account1.displayAccountDetails();
    }
}

