package Java_file_io_assignments.basic_level_problems;

// 1. Write a program to create a new text file named notes.txt and
//   write the line: “This is my first file in Java.”

import java.io.FileWriter;
import java.io.IOException;

public class Problem1
{
    public static void main(String[] args)
    {
        // This program creates a file named notes.txt and writes a line to it
        String path = "/Users/atirole/IdeaProjects/Java-File-IO-Assignments-Day-6/src/Java_file_io_assignments/basic_level_problems/All_Files/";
        try
        {
            FileWriter writer = new FileWriter(path + "notes.txt"); // Create or open the file
            writer.write("This is my first file in Java.");  // Write the line to the file
            writer.close();  // Close the writer to save changes
        }
        catch (IOException e)
        {
            e.printStackTrace(); // Handle any I/O errors
        }
    }
}

