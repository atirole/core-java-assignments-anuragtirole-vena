package task_6_student_registry_static_vs_instance_example;

public class Student
{
    private static int studentCount = 0;  // static variable to track total students
    private int studentId;                // instance variable
    private String name;

    // Constructor
    public Student(String name)
    {
        studentCount++;                 // Increment counter when a new Student is created
        this.studentId = studentCount;   // Unique ID = current count
        this.name = name;
    }

    // Method to display student details
    public void displayInfo()
    {
        System.out.println("Student ID: " + studentId + ", Name: " + name);
    }

    // Static method to show total students
    public static void showTotalStudents()
    {
        System.out.println("Total Students: " + studentCount);
    }
}
