package Java_file_io_assignments.basic_level_problems;
// 4️ Write a program to count the number of lines in a text file called data.txt.
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Problem4
{
    public static void main(String[] args)
    {
        // Define the file path for the data.txt in the current directory
        FileReader fileReader = null;   // Declare FileReader
        BufferedReader reader = null;   // Declare BufferedReader

        int lineCount = 0;  // Initialize line counter
        String path = "/Users/atirole/IdeaProjects/Java-File-IO-Assignments-Day-6/src/Java_file_io_assignments/basic_level_problems/All_Files/";
        try
        {
            fileReader = new FileReader(path + "data.txt");  // Create FileReader for data.txt
            reader = new BufferedReader(fileReader);  // Wrap FileReader in BufferedReader

            String line;
            while ((line = reader.readLine()) != null)
            {
                lineCount++;  // Increment line counter for each line read
            }

            // Print the total number of lines
            System.out.println("Total number of lines in data.txt: " + lineCount);
        }
        catch (IOException e)
        {
            System.out.println("IOException: " + e.getMessage());
            e.printStackTrace();  // Handle any I/O errors
        }
        finally
        {
            try {
                if (reader != null) {
                    reader.close();  // Close BufferedReader
                }
                if (fileReader != null) {
                    fileReader.close();  // Close FileReader
                }
            } catch (IOException e) {
                System.out.println("IOException during closing: " + e.getMessage());
                e.printStackTrace();  // Handle closing errors
            }
        }
    }
}
