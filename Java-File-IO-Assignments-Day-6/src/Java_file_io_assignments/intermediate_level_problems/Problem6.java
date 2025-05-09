package Java_file_io_assignments.intermediate_level_problems;
// 6️ Write a program to read all the words from paragraph.txt and count how many times the word "Java" appears.
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Problem6
{
    public static void main(String[] args)
    {
        BufferedReader reader = null;
        int javaCount = 0; // Counter for occurrences of the word "Java"
        String path = "/Users/atirole/IdeaProjects/Java-File-IO-Assignments-Day-6/src/Java_file_io_assignments/intermediate_level_problems/All_Files/";
        try
        {
            reader = new BufferedReader(new FileReader(path + "paragraph.txt")); // Open the file
            String line;

            while ((line = reader.readLine()) != null)
            {
                // Split the line into words using space and punctuation as delimiters
                String[] words = line.split("\\W+");

                // Check each word
                for (String word : words)
                {
                    if (word.equals("Java")) // Case-sensitive match
                    {
                        javaCount++;
                    }
                }
            }

            // Output the result
            System.out.println("The word \"Java\" appears " + javaCount + " times in paragraph.txt.");
        }
        catch (IOException e)
        {
            System.out.println("IOException: " + e.getMessage());
            e.printStackTrace(); // Handle file reading errors
        }
        finally
        {
            try
            {
                if (reader != null)
                {
                    reader.close(); // Close the reader
                }
            }
            catch (IOException e)
            {
                System.out.println("Error closing the file: " + e.getMessage());
            }
        }
    }
}
