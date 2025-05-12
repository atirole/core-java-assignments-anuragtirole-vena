package Exception_Handling_Assignments.Task_2_custom_exception_with_hierarchy;

public class InvalidAccountException extends BankingException
{
  public InvalidAccountException(String message) {
    super(message);
  }
}
