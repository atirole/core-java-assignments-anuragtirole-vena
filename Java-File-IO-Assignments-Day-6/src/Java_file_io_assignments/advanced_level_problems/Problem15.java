package Java_file_io_assignments.advanced_level_problems;
// 15️ Write a program that reads a text file and counts the frequency of
//each character (including spaces and punctuation). Print the result to a
//file named charcount.txt.
import java.io.*;
import java.util.*;

public class Problem15
{
    public static void main(String[] args)
    {
        String path = "/Users/atirole/IdeaProjects/Java-File-IO-Assignments-Day-6/src/Java_file_io_assignments/advanced_level_problems/All_Files/";
        File inputFile = new File(path + "source.txt");
        File outputFile = new File(path + "charcount.txt");

        // Map to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        BufferedReader reader = null;
        BufferedWriter writer = null;

        try
        {
            reader = new BufferedReader(new FileReader(inputFile));

            int ch;
            while ((ch = reader.read()) != -1) {
                char c = (char) ch;
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }

            writer = new BufferedWriter(new FileWriter(outputFile));

            for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue());
                writer.newLine();
            }

            System.out.println("Character count written to charcount.txt check charcount.txt file.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            try {
                if (reader != null) reader.close();
                if (writer != null) writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
