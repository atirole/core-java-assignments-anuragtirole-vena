package hands_on_task_collection_framework;


public class Main
{
    public static void main(String[] args)
    {
        RegistrationSystem system = new RegistrationSystem();

        // Add sample students
        Student s1 = new Student("S101", "Anurag", "anurag@uni.edu", 2, "CSE");
        Student s2 = new Student("S102", "Vijay", "viajy.edu", 3, "ECE");
        Student s3 = new Student("S103", "Mahesh", "mahi.edu", 1, "CSE");

        system.addStudent(s1);
        system.addStudent(s2);
        system.addStudent(s3);

        // Add sample courses
        Course c1 = new Course("CSE101", "Data Structures", "Dr. Smith", 2, 4);
        Course c2 = new Course("ECE202", "Artificial Intelligence", "Dr. Alice", 1, 3);

        system.addCourse(c1);
        system.addCourse(c2);

        // Register students
        system.registerStudentToCourse("S101", "CSE101");
        system.registerStudentToCourse("S102", "CSE101");
        system.registerStudentToCourse("S103", "CSE101"); // Goes to waitlist

        // Drop and promote from waitlist
        system.dropCourse("S101", "CSE101");

        // Listings
        system.listStudentsInCourse("CSE101");
        system.listStudentsByBranch("CSE");
        system.listCoursesByEnrollment();
        system.listCoursesByInstructor("Dr. Smith");
        system.listCoursesByCredits(4);
    }
}
