package Exception_Handling_Assignments.Task_8_programmatic_exception_handling_policy;

public class ServiceReader
{

    private static final int MAX_RETRIES = 3;

    public String fetchDataFromService() throws ServiceUnavailableException
    {
        FlakyService service = new FlakyService();
        int attempts = 0;

        while (attempts < MAX_RETRIES)
        {
            try
            {
                return service.readData();  // Try to read data from the service
            }
            catch (ServiceUnavailableException e)
            {
                attempts++;
                System.err.println(e.getMessage());
                if (attempts == MAX_RETRIES)
                {
                    throw new ServiceUnavailableException("Service is unavailable after " + MAX_RETRIES + " attempts.");
                }
            }
        }
        return null;  // Never reached if exception is thrown after all retries
    }
}
