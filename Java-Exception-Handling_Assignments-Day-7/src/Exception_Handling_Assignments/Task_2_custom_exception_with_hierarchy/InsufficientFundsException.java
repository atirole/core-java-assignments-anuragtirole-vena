package Exception_Handling_Assignments.Task_2_custom_exception_with_hierarchy;

public class InsufficientFundsException extends BankingException
{
  public InsufficientFundsException(String message)
  {
    super(message);
  }
}
