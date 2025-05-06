package Level_6_data_processing_and_ransformations;

// Problem32: From a list of students with names and grades, return a list of names of students who scored above 80, sorted alphabetically.
import java.util.*;
import java.util.stream.*;

public class Problem32
{
    static class Student
    {
        private String name;
        private int grade;

        public Student(String name, int grade)
        {
            this.name = name;
            this.grade = grade;
        }

        public String getName()
        {
            return name;
        }

        public int getGrade()
        {
            return grade;
        }
    }

    public static void main(String[] args)
    {
        List<Student> students = Arrays.asList(
                new Student("Anurag", 85),
                new Student("Vijay", 78),
                new Student("Sandeep", 92),
                new Student("Ayushi", 81),
                new Student("Gopal", 75)
        );

        List<String> topStudents = students.stream()
                .filter(s -> s.getGrade() > 80)            // only grades > 80
                .map(Student::getName)                     // extract names
                .sorted()                                  // sort alphabetically
                .collect(Collectors.toList());

        System.out.println("Students scoring above 80: " + topStudents);
    }
}
