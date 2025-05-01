package task_15_college_subject_allotment;
import java.util.Arrays;


public class Main
{
    public static void main(String[] args)
    {
        CollegeSubjectAllotment allotment = new CollegeSubjectAllotment();

        // Allot subjects to students
        allotment.allotSubjects("Anurag", Arrays.asList("Math", "Physics"));
        allotment.allotSubjects("Vijay", Arrays.asList("Chemistry", "Math"));
        allotment.allotSubjects("Mahesh", Arrays.asList("Biology", "Physics"));

        // Display all allotments
        allotment.showAllotments();

        // Reverse lookup for "Math"
        System.out.println("\nStudents who chose Math:");
        for (String student : allotment.getStudentsBySubject("Math"))
        {
            System.out.println(student);
        }
    }
}
