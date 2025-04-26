package task_6_student_registry_static_vs_instance_example;

public class Main
{
    public static void main(String[] args)
    {
        Student s1 = new Student("Anurag");
        Student s2 = new Student("Vijay");
        Student s3 = new Student("Mahesh");

        // Display individual student details
        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();

        // Show total number of students
        Student.showTotalStudents();
    }
}

