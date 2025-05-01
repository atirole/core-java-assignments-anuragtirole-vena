package task_1_advanced_student_management;
import java.util.Comparator;

public class StudentComparator implements Comparator<Student>
{
    @Override
    public int compare(Student s1, Student s2)
    {
        int branchCompare = s1.getBranch().compareTo(s2.getBranch());
        if (branchCompare == 0)
        {
            return Double.compare(s2.getGrade(), s1.getGrade()); // descending grade
        }
        return branchCompare;
    }
}

