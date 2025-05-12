package Exception_Handling_Assignments.Task_6_custom_checked_vs_unchecked_exceptions;

public class Main
{
    public static void main(String[] args)
    {
        Validator validator = new Validator();
        SystemManager system = new SystemManager();

        System.out.println("=== Checked Exception Example ===");
        try
        {
            validator.validateFileName("data.pdf"); // invalid file
        }
        catch (FileValidationException e)
        {
            System.err.println("Validation failed: " + e.getMessage());
        }

        System.out.println("\n=== Unchecked Exception Example ===");
        // No try-catch required, unchecked exception will crash if unhandled
        system.startSystem(true);
    }
}
