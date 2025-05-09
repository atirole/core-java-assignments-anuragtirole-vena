package Java_file_io_assignments.intermediate_level_problems;
// 7️ Write a program to append the line “Last updated on [current date]” to an existing file log.txt.
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Problem7
{
    public static void main(String[] args)
    {
        BufferedWriter writer = null;
        String path = "/Users/atirole/IdeaProjects/Java-File-IO-Assignments-Day-6/src/Java_file_io_assignments/intermediate_level_problems/All_Files/";
        try
        {
            // Open log.txt in append mode (true means append)
            writer = new BufferedWriter(new FileWriter(path + "log.txt", true));

            // Get the current date
            LocalDate currentDate = LocalDate.now();

            // Prepare the line to append
            String line = "Last updated on " + currentDate.toString();

            // Append the line to the file
            writer.newLine();  // Start a new line
            writer.write(line);

            System.out.println("Line appended to log.txt successfully.");
        }
        catch (IOException e)
        {
            System.out.println("IOException: " + e.getMessage());
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if (writer != null)
                {
                    writer.close();  // Always close writer
                }
            }
            catch (IOException e)
            {
                System.out.println("Error closing writer: " + e.getMessage());
            }
        }
    }
}
