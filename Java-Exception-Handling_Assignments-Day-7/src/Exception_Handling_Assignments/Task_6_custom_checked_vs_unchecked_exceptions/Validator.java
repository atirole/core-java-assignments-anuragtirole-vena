package Exception_Handling_Assignments.Task_6_custom_checked_vs_unchecked_exceptions;

public class Validator
{

    public void validateFileName(String fileName) throws FileValidationException
    {
        if (fileName == null || !fileName.endsWith(".txt"))
        {
            throw new FileValidationException("Only .txt files are allowed");
        }
        System.out.println("File name is valid: " + fileName);
    }
}
