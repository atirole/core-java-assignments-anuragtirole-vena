package task_1_advanced_student_management;

public class Student {
    private int id;
    private String name;
    private int age;
    private double grade;
    private String branch;

    // Constructor
    public Student(int id, String name, int age, double grade, String branch) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.branch = branch;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public double getGrade()
    {
        return grade;
    }

    public String getBranch()
    {
        return branch;
    }

    @Override
    public String toString()
    {
        // The toString() method is overridden to provide a custom string representation of the Student object.
        // This allows for easier printing and logging of the Student details in a human-readable format.
        // The format used includes the student's ID, name, age, grade, and branch.
        return String.format("ID: %d, Name: %s, Age: %d, Grade: %.2f, Branch: %s",
                id, name, age, grade, branch);
    }
}


