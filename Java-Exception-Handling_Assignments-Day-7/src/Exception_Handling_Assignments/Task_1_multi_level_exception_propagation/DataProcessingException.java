package Exception_Handling_Assignments.Task_1_multi_level_exception_propagation;

public class DataProcessingException extends Exception
{
    public DataProcessingException(String message, Throwable cause)
    {
        super(message, cause);
    }
}
