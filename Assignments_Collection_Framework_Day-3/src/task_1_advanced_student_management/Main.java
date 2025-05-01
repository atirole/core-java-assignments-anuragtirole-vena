package task_1_advanced_student_management;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Radha", 20, 8.5, "CSE"));
        studentList.add(new Student(2, "Anurag", 21, 7.9, "ECE"));
        studentList.add(new Student(3, "Mayur", 22, 9.0, "CSE"));
        studentList.add(new Student(4, "Mahesh", 20, 8.2, "EEE"));
        studentList.add(new Student(5, "Sanskar", 19, 9.1, "ECE"));
        studentList.add(new Student(6, "Sandeep", 23, 6.8, "ME"));
        studentList.add(new Student(7, "Sarthak", 21, 7.3, "CSE"));
        studentList.add(new Student(8, "Gopal", 20, 8.7, "ME"));
        studentList.add(new Student(9, "Aryan", 22, 7.4, "ECE"));
        studentList.add(new Student(10, "Ayushi", 20, 7.0, "EEE"));
        studentList.add(new Student(11, "Renuka", 21, 8.3, "ME"));
        studentList.add(new Student(12, "Gopal", 20, 7.9, "CSE"));
        studentList.add(new Student(13, "Hariom", 19, 9.2, "ECE"));
        studentList.add(new Student(14, "Govind", 23, 6.5, "EEE"));
        studentList.add(new Student(15, "Vijay", 22, 8.9, "ME"));

        // Sort by branch then grade descending
        Collections.sort(studentList, new StudentComparator());

        System.out.println("Sorted Students (by Branch and Descending Grade):");
        for (Student s : studentList)
        {
            System.out.println(s);
        }

        // Group by branch using Map (if-else version)
        Map<String, List<Student>> branchMap = new HashMap<>();

        for (Student s : studentList)
        {
            if (!branchMap.containsKey(s.getBranch()))
            {
                branchMap.put(s.getBranch(), new ArrayList<>());
            }
            branchMap.get(s.getBranch()).add(s);
        }

        System.out.println("\nGrouped Students by Branch:");
        for (String branch : branchMap.keySet())
        {
            System.out.println("Branch: " + branch);
            for (Student s : branchMap.get(branch))
            {
                System.out.println("  " + s);
            }
        }
    }
}

