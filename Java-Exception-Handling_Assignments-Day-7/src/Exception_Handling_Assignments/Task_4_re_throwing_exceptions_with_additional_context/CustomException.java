package Exception_Handling_Assignments.Task_4_re_throwing_exceptions_with_additional_context;

public class CustomException extends Exception
{
  public CustomException(String message, Throwable cause)
  {
    super(message, cause);
  }
}
