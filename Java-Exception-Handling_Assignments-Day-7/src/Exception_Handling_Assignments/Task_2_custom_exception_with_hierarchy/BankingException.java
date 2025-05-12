package Exception_Handling_Assignments.Task_2_custom_exception_with_hierarchy;
// Base Exception
public class BankingException extends Exception
{
  public BankingException(String message)
  {
    super(message);
  }
}
