package Java_file_io_assignments.basic_level_problems;

// 2️ Write a program to read and print the contents of a file named
// input.txt

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Problem2
{
    public static void main(String[] args) {


        FileReader fileReader = null;          // Declare FileReader
        BufferedReader reader = null;          // Declare BufferedReader

        try
        {
            String path = "/Users/atirole/IdeaProjects/Java-File-IO-Assignments-Day-6/src/Java_file_io_assignments/basic_level_problems/All_Files/";
            fileReader = new FileReader(path + "input.txt");        // Create FileReader
            reader = new BufferedReader(fileReader);         // Wrap in BufferedReader

            String line;
            while ((line = reader.readLine()) != null)
            {
                System.out.println(line); // Print each line from the file
            }
        }
        catch (IOException e)
        {
            e.printStackTrace(); // Handle any I/O errors
        }
        finally
        {
            try {
                if (reader != null)
                {
                    reader.close(); // Close BufferedReader
                }
                if (fileReader != null)
                {
                    fileReader.close(); // Close FileReader
                }
            }
            catch (IOException e)
            {
                e.printStackTrace(); // Handle any errors during closing
            }
        }
    }
}
