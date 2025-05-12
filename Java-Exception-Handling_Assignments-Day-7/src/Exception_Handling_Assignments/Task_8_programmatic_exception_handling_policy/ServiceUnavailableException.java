package Exception_Handling_Assignments.Task_8_programmatic_exception_handling_policy;

public class ServiceUnavailableException extends RuntimeException
{
    public ServiceUnavailableException(String message)
    {
        super(message);
    }
}
