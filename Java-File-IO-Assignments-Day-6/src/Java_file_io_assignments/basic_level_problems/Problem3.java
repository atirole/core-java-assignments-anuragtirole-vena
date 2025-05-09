package Java_file_io_assignments.basic_level_problems;
// 3️ Write a program that checks if a file named report.pdf exists in the current directory and prints its size (in bytes).
import java.io.File;
import java.io.IOException;

public class Problem3
{
    public static void main(String[] args)
    {
        // Define the file path for the report.pdf in the current directory
        File file = new File("/Users/atirole/IdeaProjects/Java-File-IO-Assignments-Day-6/src/Java_file_io_assignments/basic_level_problems/All_Files/report.pdf");

        try
        {
            // Check if the file exists
            if (file.exists())
            {
                // Get the file size in bytes
                long fileSize = file.length();
                System.out.println("The file 'report.pdf' exists.");
                System.out.println("File size: " + fileSize + " bytes");
            }
            else
            {
                // If the file doesn't exist, throw an IOException
                throw new IOException("File 'report.pdf' does not exist in the current directory.");
            }
        }
        catch (IOException e)
        {
            // Handle file-related exceptions (file not found, I/O issues)
            System.out.println("IOException: " + e.getMessage());
            e.printStackTrace();
        }
        catch (Exception e)
        {
            // Handle any other unexpected exceptions
            System.out.println("An unexpected error occurred.");
            e.printStackTrace();
        }
    }
}
