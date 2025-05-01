package task_15_college_subject_allotment;

import java.util.*;

public class CollegeSubjectAllotment
{
    private Map<String, List<String>> studentSubjectsMap = new HashMap<>();

    // Add subject(s) to a student
    public void allotSubjects(String student, List<String> subjects)
    {
        studentSubjectsMap.put(student, subjects);
        System.out.println("Allotted to " + student + ": " + subjects);
    }

    // Reverse lookup: get students who chose a specific subject
    public List<String> getStudentsBySubject(String subject)
    {
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : studentSubjectsMap.entrySet())
        {
            if (entry.getValue().contains(subject))
            {
                result.add(entry.getKey());
            }
        }
        return result;
    }

    // Display all allotments
    public void showAllotments()
    {
        System.out.println("\nSubject Allotments:");
        for (Map.Entry<String, List<String>> entry : studentSubjectsMap.entrySet())
        {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
