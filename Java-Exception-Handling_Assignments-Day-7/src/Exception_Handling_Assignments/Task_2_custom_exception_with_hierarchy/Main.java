package Exception_Handling_Assignments.Task_2_custom_exception_with_hierarchy;
//
public class Main
{
    public static void main(String[] args)
    {
        BankService service = new BankService();

        System.out.println("=== Catching separately ===");
        try
        {
            service.transferFunds("11111", "67890", 1000);  // Invalid account
        }
        catch (InvalidAccountException e)
        {
            System.err.println("Caught InvalidAccountException: " + e.getMessage());
        }
        catch (InsufficientFundsException e)
        {
            System.err.println("Caught InsufficientFundsException: " + e.getMessage());
        }

        System.out.println("\n=== Catching using base class ===");
        try
        {
            service.transferFunds("12345", "67890", 10000); // Insufficient funds
        }
        catch (BankingException e)  // can handle both exception
        {
            System.err.println("Caught BankingException: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }
}
