package hands_on_task_collection_framework;

import java.util.*;

public class Course
{
    private String courseId;
    private String courseName;
    private String instructorName;
    private int capacity;
    private int credits;

    private Set<Student> enrolledStudents = new TreeSet<>(Comparator.comparing(Student::getName));
    private Queue<Student> waitlist = new LinkedList<>();

    public Course(String courseId, String courseName, String instructorName, int capacity, int credits)
    {
        this.courseId = courseId;
        this.courseName = courseName;
        this.instructorName = instructorName;
        this.capacity = capacity;
        this.credits = credits;
    }

    public String getCourseId()
    {
        return courseId;
    }
    public String getCourseName()
    {
        return courseName;
    }
    public String getInstructorName()
    {
        return instructorName;
    }
    public int getCapacity()
    {
        return capacity;
    }
    public int getCredits()
    {
        return credits;
    }
    public Set<Student> getEnrolledStudents()
    {
        return enrolledStudents;
    }
    public Queue<Student> getWaitlist()
    {
        return waitlist;
    }

    public boolean isFull()
    {
        return enrolledStudents.size() >= capacity;
    }

    public boolean enroll(Student student)
    {
        if (enrolledStudents.contains(student) || waitlist.contains(student))
        {
            return false;
        }
        if (!isFull())
        {
            enrolledStudents.add(student);
        } else
        {
            waitlist.add(student);
        }
        return true;
    }

    public boolean drop(Student student)
    {
        boolean removed = enrolledStudents.remove(student);
        if (removed && !waitlist.isEmpty())
        {
            enrolledStudents.add(waitlist.poll());
        }
        else if (!removed)
        {
            waitlist.remove(student);
        }
        return removed;
    }

    @Override
    public String toString()
    {
        return courseId + " - " + courseName + " (" + instructorName + ")";
    }
}

