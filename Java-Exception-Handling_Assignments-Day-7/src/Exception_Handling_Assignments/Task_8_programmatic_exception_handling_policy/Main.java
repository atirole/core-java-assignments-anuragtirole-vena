package Exception_Handling_Assignments.Task_8_programmatic_exception_handling_policy;

public class Main
{
    public static void main(String[] args)
    {
        ServiceReader reader = new ServiceReader();

        try
        {
            String data = reader.fetchDataFromService();
            System.out.println("Received data: " + data);
        }
        catch (ServiceUnavailableException e)
        {
            System.err.println("Failed to retrieve data: " + e.getMessage());
        }
    }
}