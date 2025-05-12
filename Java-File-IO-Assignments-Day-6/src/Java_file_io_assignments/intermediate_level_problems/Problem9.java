package Java_file_io_assignments.intermediate_level_problems;
// 9️ Write a program to delete a file named oldfile.txt if it exists.
import java.io.File;

public class Problem9
{
    public static void main(String[] args)
    {
        String path = "/Users/atirole/IdeaProjects/Java-File-IO-Assignments-Day-6/src/Java_file_io_assignments/intermediate_level_problems/All_Files/";
        File file = new File(path+ "oldfile.txt"); // Create a File object for oldfile.txt

        if (file.exists())
        {
            // Try to delete the file
            if (file.delete())
            {
                System.out.println("File oldfile.txt was successfully deleted.");
            } else {
                System.out.println("File oldfile.txt could not be deleted.");
            }
        }
        else
        {
            System.out.println("File oldfile.txt does not exist.");
        }
    }
}
