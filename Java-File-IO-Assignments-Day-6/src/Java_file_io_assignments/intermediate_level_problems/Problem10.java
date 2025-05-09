package Java_file_io_assignments.intermediate_level_problems;
// 10. Write a program to list all files and directories in a folder called documents.
import java.io.File;

public class Problem10
{
    public static void main(String[] args)
    {
        String path = "/Users/atirole/IdeaProjects/Java-File-IO-Assignments-Day-6/src/Java_file_io_assignments/intermediate_level_problems/All_Files/";
        File folder = new File(path + "documents"); // Folder named 'documents'

        // Check if the folder exists and is a directory
        if (folder.exists() && folder.isDirectory())
        {
            File[] files = folder.listFiles(); // Get all files and subdirectories

            if (files != null && files.length > 0)
            {
                System.out.println("Contents of 'documents' folder:");
                for (File file : files)
                {
                    if (file.isFile())
                    {
                        System.out.println("File: " + file.getName());
                    }
                    else if (file.isDirectory())
                    {
                        System.out.println("Directory: " + file.getName());
                    }
                }
            }
            else
            {
                System.out.println("The 'documents' folder is empty.");
            }
        }
        else
        {
            System.out.println("The 'documents' folder does not exist or is not a directory.");
        }
    }
}
