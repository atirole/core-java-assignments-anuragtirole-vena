package Exception_Handling_Assignments.Task_6_custom_checked_vs_unchecked_exceptions;

public class FileValidationException extends Exception
{
    public FileValidationException(String message)
    {
        super(message);
    }
}
