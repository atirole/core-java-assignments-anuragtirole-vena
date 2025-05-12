package Exception_Handling_Assignments.Task_5_Partial_transaction_rollback_on_failure;
// Transcation Starts here
public class Main
{
    public static void main(String[] args)
    {
        BankService bank = new BankService();

        // Creating accounts
        BankAccount acc1 = new BankAccount("A100", 10000);
        BankAccount acc2 = new BankAccount("B200", 5000);

        bank.addAccount(acc1);
        bank.addAccount(acc2);

        System.out.println("=== Before Transfer ===");
        bank.printBalances();

        // Valid transfer
        bank.transfer("A100", "B200", 2000);

        System.out.println("\n=== After Valid Transfer ===");
        bank.printBalances();

        // Invalid transfer (target account doesn't exist)
        bank.transfer("A100", "Z999", 3000);

        System.out.println("\n=== After Failed Transfer (with rollback) ===");
        bank.printBalances();
    }
}
