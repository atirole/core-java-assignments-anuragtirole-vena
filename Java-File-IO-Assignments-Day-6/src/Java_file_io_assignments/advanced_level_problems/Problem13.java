package Java_file_io_assignments.advanced_level_problems;
// 13️ Write a program that monitors a log file (server.log) and prints only the lines that contain the word "ERROR".
import java.io.*;

public class Problem13 {
    public static void main(String[] args)
    {
        String path = "/Users/atirole/IdeaProjects/Java-File-IO-Assignments-Day-6/src/Java_file_io_assignments/advanced_level_problems/All_Files/";
        File logFile = new File(path + "server.log");

        if (!logFile.exists())
        {
            System.out.println("Log file server.log not found.");
            return;
        }

        try (RandomAccessFile reader = new RandomAccessFile(logFile, "r"))
        {
            long lastKnownPosition = 0; // Start from beginning instead of end

            while (true)
            {
                long currentLength = logFile.length();
                if (currentLength < lastKnownPosition)
                {
                    // File was truncated or rotated
                    lastKnownPosition = 0;
                }

                if (currentLength > lastKnownPosition)
                {
                    reader.seek(lastKnownPosition); // Move to last read position
                    String line;
                    while ((line = reader.readLine()) != null)
                    {

                        if (line.contains("ERROR"))
                        {
                            System.out.println("\n"+line); // Print ERROR lines
                        }
                    }
                    lastKnownPosition = reader.getFilePointer(); // Save new position
                }

                Thread.sleep(1000); // Wait 1 second before next check
            }
        } catch (IOException | InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
