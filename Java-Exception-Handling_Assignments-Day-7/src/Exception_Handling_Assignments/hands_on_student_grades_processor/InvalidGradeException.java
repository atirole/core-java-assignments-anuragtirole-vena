package Exception_Handling_Assignments.hands_on_student_grades_processor;


public class InvalidGradeException extends Exception
{
    // Constructor to pass the message to the parent Exception class
    public InvalidGradeException(String message)
    {
        super(message);
    }
}
