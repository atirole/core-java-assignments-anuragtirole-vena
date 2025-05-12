package Exception_Handling_Assignments.Task_6_custom_checked_vs_unchecked_exceptions;

public class CriticalSystemException extends RuntimeException
{
    public CriticalSystemException(String message)
    {
        super(message);
    }
}
