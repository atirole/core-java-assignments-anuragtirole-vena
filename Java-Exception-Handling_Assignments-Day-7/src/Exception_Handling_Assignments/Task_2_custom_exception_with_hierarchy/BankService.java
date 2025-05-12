package Exception_Handling_Assignments.Task_2_custom_exception_with_hierarchy;

public class BankService
{

    public void transferFunds(String fromAccount, String toAccount, double amount) throws InvalidAccountException, InsufficientFundsException
    {

        if (!fromAccount.equals("12345") || !toAccount.equals("67890")) {
            throw new InvalidAccountException("One of the accounts is invalid.");
        }

        if (amount > 5000)
        {
            throw new InsufficientFundsException("Insufficient funds for this transfer.");
        }

        System.out.println("Transfer of ₹" + amount + " successful from " + fromAccount + " to " + toAccount);
    }
}
