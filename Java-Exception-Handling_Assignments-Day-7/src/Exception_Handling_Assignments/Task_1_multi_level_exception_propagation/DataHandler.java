package Exception_Handling_Assignments.Task_1_multi_level_exception_propagation;

import java.io.IOException;

public class DataHandler
{

    // Simulates reading from a file
    public void readData() throws IOException
    {
        // Simulating an I/O error
        throw new IOException("Failed to read data from file.");
    }

    // Processes data, wrapping IOException in a custom exception
    public void processData() throws DataProcessingException
    {
        try
        {
            readData();
        }
        catch (IOException e)
        {
            throw new DataProcessingException("Error occurred during data processing.", e);
        }
    }
}
