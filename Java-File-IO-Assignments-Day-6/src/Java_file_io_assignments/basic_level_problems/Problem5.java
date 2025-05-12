package Java_file_io_assignments.basic_level_problems;
// 5️ Write a program that copies the contents of source.txt to a new file called backup.txt.
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Problem5
{
    public static void main(String[] args)
    {
        // Define file paths for source.txt and backup.txt
        BufferedReader reader = null;
        BufferedWriter writer = null;
        String path = "/Users/atirole/IdeaProjects/Java-File-IO-Assignments-Day-6/src/Java_file_io_assignments/basic_level_problems/All_Files/";

        try
        {
            // Open the source file and the destination (backup) file
            reader = new BufferedReader(new FileReader(path + "source.txt"));
            writer = new BufferedWriter(new FileWriter(path +"backup.txt"));

            String line;
            // Read from source.txt and write to backup.txt
            while ((line = reader.readLine()) != null)
            {
                writer.write(line);
                writer.newLine();  // Write a new line in backup.txt
            }

            System.out.println("Contents copied from source.txt to backup.txt successfully.");
        } catch (IOException e)
        {
            System.out.println("IOException: " + e.getMessage());
            e.printStackTrace();  // Handle any I/O errors
        }
        finally
        {
            try
            {
                if (reader != null)
                {
                    reader.close();  // Close BufferedReader
                }
                if (writer != null)
                {
                    writer.close();  // Close BufferedWriter
                }
            }
            catch (IOException e)
            {
                System.out.println("IOException during closing: " + e.getMessage());
                e.printStackTrace();  // Handle closing errors
            }
        }
    }
}
