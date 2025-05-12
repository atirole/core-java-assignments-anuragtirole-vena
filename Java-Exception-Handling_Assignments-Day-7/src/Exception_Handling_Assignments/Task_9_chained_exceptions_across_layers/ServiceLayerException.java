package Exception_Handling_Assignments.Task_9_chained_exceptions_across_layers;


public class ServiceLayerException extends Exception
{
    public ServiceLayerException(String message, Throwable cause)
    {
        super(message, cause);
    }
}
