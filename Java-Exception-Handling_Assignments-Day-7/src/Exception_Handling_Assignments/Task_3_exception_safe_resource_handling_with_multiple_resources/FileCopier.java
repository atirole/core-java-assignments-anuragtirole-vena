package Exception_Handling_Assignments.Task_3_exception_safe_resource_handling_with_multiple_resources;

import java.io.*;

public class FileCopier
{

    public void copy(String inputFile, String outputFile)
    {
        // try-with-resources ensures both reader and writer are closed automatically
        try (
                BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
            )
        {
            String line;
            while ((line = reader.readLine()) != null)
            {
                writer.write(line);
                writer.newLine(); // Maintain line breaks
            }
            System.out.println("File copied successfully from inputFile to outputFile ");
        }
        catch (IOException e)
        {
            System.err.println("I/O Error during file copy: " + e.getMessage());
        }
    }
}
