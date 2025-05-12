package Exception_Handling_Assignments.Task_8_programmatic_exception_handling_policy;

import java.util.Random;

public class FlakyService {

    public String readData() throws ServiceUnavailableException
    {
        Random random = new Random();
        int attempt = random.nextInt(4);  // Random number between 0 and 3

        if (attempt < 3)
        {
            // Simulate a failure (e.g., flaky service failure)
            throw new ServiceUnavailableException("Service failed on attempt " + (attempt + 1));
        }

        // Simulate successful data retrieval
        return "Successfully read data from service!";
    }
}

