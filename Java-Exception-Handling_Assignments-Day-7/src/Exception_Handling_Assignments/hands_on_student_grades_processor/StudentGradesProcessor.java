package Exception_Handling_Assignments.hands_on_student_grades_processor;

import java.io.*;
import java.util.*;

public class StudentGradesProcessor
{

    public static void main(String[] args)
    {

        String filePath = "/Users/atirole/Users/atirole/IdeaProjects/Java-Exception-Handling_Assignments-Day-7/src/Exception_Handling_Assignments/hands_on_student_grades_processor/grades.txt";  // File path for reading grades from grades.txt
        List<String> validGrades = new ArrayList<>();
        List<String> failingStudents = new ArrayList<>();
        double totalGrade = 0;
        int validCount = 0;

        // Step 2: Read and Parse File
        try (BufferedReader br = new BufferedReader(new FileReader(filePath)))
        {
            String line;
            while ((line = br.readLine()) != null)
            {
                String[] parts = line.split(" ");  // Split line into name and grade based on space

                // Step 3: Validate Data
                if (parts.length != 2)
                {
                    System.out.println("Skipping invalid line: " + line);
                    continue;  // Skip lines that don't have exactly 2 parts
                }

                String name = parts[0];
                int grade = 0;

                try
                {
                    grade = Integer.parseInt(parts[1]);  // Try to parse the grade
                    // Check if grade is out of range
                    if (grade < 0 || grade > 100)
                    {
                        throw new InvalidGradeException("Grade out of range: " + grade);
                    }
                }
                catch (NumberFormatException e)
                {
                    // If grade is not a valid number
                    System.out.println("Skipping invalid grade for " + name);
                    continue;
                }
                catch (InvalidGradeException e)
                {
                    // Handle the custom exception for out-of-range grades
                    System.out.println(e.getMessage() + " for " + name);
                    continue;
                }

                // Step 4: Process Valid Data
                validGrades.add(name + " " + grade);  // Add valid name and grade to list
                totalGrade += grade;  // Accumulate the total grade
                validCount++;

                // Identify failing students
                if (grade < 40)
                {
                    failingStudents.add(name);
                }
            }

            // Step 4: Calculate Results - Average
            if (validCount > 0)
            {
                double average = totalGrade / validCount;
                System.out.println("Average grade: " + average);
            }
            else
            {
                System.out.println("No valid grades to calculate average.");
            }

            // Step 6: Output Results
            System.out.println("\nFailing Students:");
            for (String student : failingStudents)
            {
                System.out.println(student);
            }

            System.out.println("\nValid Entries:");
            for (String entry : validGrades)
            {
                System.out.println(entry);
            }

        }
        catch (FileNotFoundException e)
        {
            // Step 5: Handle FileNotFoundException
            System.out.println("File not found: " + filePath);
        }
        catch (IOException e)
        {
            // Handle general IOExceptions
            System.out.println("Error reading file: " + e.getMessage());
        }
        finally
        {
            // Ensure that the process completes
            System.out.println("\nProcess completed.");
        }
    }
}
