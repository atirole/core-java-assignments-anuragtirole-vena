package Java_file_io_assignments.advanced_level_problems;
// 12️ Write a program that reads all .txt files in a folder and merges their contents into a single file named merged.txt.
import java.io.*;

public class Problem12
{
    public static void main(String[] args)
    {
        String path = "/Users/atirole/IdeaProjects/Java-File-IO-Assignments-Day-6/src/Java_file_io_assignments/advanced_level_problems/All_Files/";
        File folder = new File(path + "textfiles"); // Folder where .txt files are located
        File mergedFile = new File(path + "merged.txt"); // Final merged file

        if (!folder.exists() || !folder.isDirectory())
        {
            System.out.println("Folder 'textfiles' not found.");
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(mergedFile)))
        {
            File[] files = folder.listFiles((dir, name) -> name.endsWith(".txt")); // Filter .txt files

            if (files == null || files.length == 0)
            {
                System.out.println("No .txt files found in the folder.");
                return;
            }

            for (File file : files)
            {
                try (BufferedReader reader = new BufferedReader(new FileReader(file)))
                {
                    String line;
                    writer.write("---- Contents of: " + file.getName() + " ----\n");
                    while ((line = reader.readLine()) != null)
                    {
                        writer.write(line);
                        writer.newLine(); // Preserve line breaks
                    }
                    writer.newLine(); // Add an empty line between files
                }
            }

            System.out.println("All .txt files merged into merged.txt successfully.");

        } catch (IOException e)
        {
            System.out.println("Error while merging files: " + e.getMessage());
        }
    }
}
