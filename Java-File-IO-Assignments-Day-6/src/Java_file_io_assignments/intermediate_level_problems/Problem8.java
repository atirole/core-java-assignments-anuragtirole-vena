package Java_file_io_assignments.intermediate_level_problems;
// 8️ Write a program that reads a CSV file named employees.csv and prints each line in uppercase.
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Problem8 {
    public static void main(String[] args) {
        BufferedReader reader = null;
        String path = "/Users/atirole/IdeaProjects/Java-File-IO-Assignments-Day-6/src/Java_file_io_assignments/intermediate_level_problems/All_Files/";
        try
        {
            // Open the CSV file for reading
            reader = new BufferedReader(new FileReader(path+ "employees.csv"));
            String line;

            // Read each line and print in uppercase
            while ((line = reader.readLine()) != null)
            {
                System.out.println(line.toUpperCase()); // Convert to uppercase and print
            }

        }
        catch (IOException e)
        {
            System.out.println("IOException: " + e.getMessage());
            e.printStackTrace(); // Print stack trace for debugging
        }
        finally
        {
            try
            {
                if (reader != null)
                {
                    reader.close(); // Always close the reader
                }
            }
            catch (IOException e)
            {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }
    }
}
