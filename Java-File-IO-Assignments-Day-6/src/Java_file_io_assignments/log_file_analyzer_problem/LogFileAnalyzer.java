package Java_file_io_assignments.log_file_analyzer_problem;
import java.io.*;

public class LogFileAnalyzer
{

    public static void main(String[] args)
    {
        String path = "/Users/atirole/IdeaProjects/Java-File-IO-Assignments-Day-6/src/Java_file_io_assignments/log_file_analyzer_problem/";
        File inputFile = new File(path + "server.log");       // Input log file
        File outputFile = new File(path + "summary.txt");     // Output summary file

        int totalLines = 0;
        int errorCount = 0;
        int warningCount = 0;

        // Step 1: Analyze the log file and write summary
        // try with resources
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile)))
        {

            String line;

            while ((line = reader.readLine()) != null)
            {
                totalLines++;

                if (line.contains("ERROR"))
                {
                    errorCount++;
                }
                if (line.contains("WARNING"))
                {
                    warningCount++;
                }
            }

            // Write the summary
            writer.write("Log Summary Report\n");
            writer.write("------------------\n");
            writer.write("Total log entries: " + totalLines + "\n");
            writer.write("ERROR entries: " + errorCount + "\n");
            writer.write("WARNING entries: " + warningCount + "\n");

            System.out.println("Summary report generated in summary.txt\n");

        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error: server.log file not found.");
            return;
        }
        catch (IOException e)
        {
            System.out.println("An I/O error occurred while processing the file.");
            e.printStackTrace();
            return;
        }

        // Step 2: Read and print the content of summary.txt
        System.out.println("Contents of summary.txt:");
        try (BufferedReader summaryReader = new BufferedReader(new FileReader(outputFile)))
        {
            String summaryLine;
            while ((summaryLine = summaryReader.readLine()) != null)
            {
                System.out.println(summaryLine);
            }
        }
        catch (IOException e)
        {
            System.out.println("Error reading summary.txt");
            e.printStackTrace();
        }
    }
}
