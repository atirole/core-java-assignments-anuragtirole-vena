package hands_on_task_collection_framework;

import java.util.*;

public class RegistrationSystem
{
    private Map<String, Course> courseMap = new HashMap<>();
    private Map<String, Student> studentMap = new HashMap<>();

    public void addCourse(Course course)
    {
        courseMap.put(course.getCourseId(), course);
    }

    public void addStudent(Student student)
    {
        studentMap.put(student.getId(), student);
    }

    public boolean registerStudentToCourse(String studentId, String courseId)
    {
        Student student = studentMap.get(studentId);
        Course course = courseMap.get(courseId);

        if (student == null || course == null)
        {
            System.out.println("Invalid student or course ID.");
            return false;
        }

        if (course.enroll(student))
        {
            System.out.println(student.getName() + " registered for " + course.getCourseName());
            return true;
        } else
        {
            System.out.println("Already registered or waitlisted.");
            return false;
        }
    }

    public boolean dropCourse(String studentId, String courseId)
    {
        Student student = studentMap.get(studentId);
        Course course = courseMap.get(courseId);

        if (student == null || course == null)
        {
            System.out.println("Invalid student or course ID.");
            return false;
        }

        if (course.drop(student))
        {
            System.out.println(student.getName() + " dropped from " + course.getCourseName());
            return true;
        }
        else
        {
            System.out.println("Student not enrolled in this course.");
            return false;
        }
    }

    public void listStudentsInCourse(String courseId)
    {
        Course course = courseMap.get(courseId);
        if (course == null)
        {
            System.out.println("Invalid course ID.");
            return;
        }

        System.out.println("Students in " + course.getCourseName() + ":");
        for (Student student : course.getEnrolledStudents())
        {
            System.out.println(student);
        }
    }

    public void listStudentsByBranch(String branch)
    {
        System.out.println("Students in branch " + branch + ":");
        for (Course course : courseMap.values())
        {
            for (Student student : course.getEnrolledStudents())
            {
                if (student.getBranch().equalsIgnoreCase(branch))
                {
                    System.out.println(student + " in course " + course.getCourseName());
                }
            }
        }
    }

    public void listCoursesByEnrollment()
    {
        List<Course> sortedCourses = new ArrayList<>(courseMap.values());
        sortedCourses.sort(Comparator.comparingInt(c -> -c.getEnrolledStudents().size()));
        for (Course c : sortedCourses)
        {
            System.out.println(c + " → Enrolled: " + c.getEnrolledStudents().size());
        }
    }

    public void listCoursesByInstructor(String instructor)
    {
        for (Course course : courseMap.values())
        {
            if (course.getInstructorName().equalsIgnoreCase(instructor))
            {
                System.out.println(course);
            }
        }
    }

    public void listCoursesByCredits(int credits)
    {
        for (Course course : courseMap.values())
        {
            if (course.getCredits() == credits)
            {
                System.out.println(course);
            }
        }
    }
}

