package Java_file_io_assignments.advanced_level_problems;
// 14️ Write a program that uses NIO (Files class) to read and write data between files with proper exception handling.
import java.nio.file.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Problem14
{
    public static void main(String[] args)
    {    String path = "/Users/atirole/IdeaProjects/Java-File-IO-Assignments-Day-6/src/Java_file_io_assignments/advanced_level_problems/All_Files/";
        // Define the source and destination files
        Path sourcePath = Paths.get(path + "source.txt");
        Path destinationPath = Paths.get(path + "destination.txt");

        try
        {
            // Check if the source file exists
            if (!Files.exists(sourcePath))
            {
                System.out.println("Source file not found.");
                return;
            }

            // Read all bytes from the source file
            byte[] fileData = Files.readAllBytes(sourcePath);

            // Write the data into the destination file
            Files.write(destinationPath, fileData);

            System.out.println("File content copied successfully from source.txt to destination.txt");

        } catch (IOException e)
        {
            // Handle any I/O exceptions
            System.out.println("An error occurred during file operations.");
            e.printStackTrace();
        }
    }
}
