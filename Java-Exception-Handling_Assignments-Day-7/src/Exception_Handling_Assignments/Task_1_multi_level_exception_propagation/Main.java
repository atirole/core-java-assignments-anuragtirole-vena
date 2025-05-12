package Exception_Handling_Assignments.Task_1_multi_level_exception_propagation;

public class Main
{
    public static void main(String[] args)
    {
        DataHandler handler = new DataHandler();
        try
        {
            handler.processData();
        }
        catch (DataProcessingException e)
        {
            System.err.println("Exception caught in main: " + e.getMessage());
            System.err.println("Root cause: " + e.getCause());
        }
    }
}
