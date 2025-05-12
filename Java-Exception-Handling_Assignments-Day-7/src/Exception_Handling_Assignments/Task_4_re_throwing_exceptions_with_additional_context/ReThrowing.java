package Exception_Handling_Assignments.Task_4_re_throwing_exceptions_with_additional_context;

public class ReThrowing
{

    public void execute() throws CustomException
    {
        try
        {
            simulateError();
        }
        catch (ArithmeticException e)
        {
            // Re-throw with context while preserving original exception
            throw new CustomException("Computation failed due to arithmetic error", e);
        }
    }

    private void simulateError()
    {
        int result = 10 / 0; // This triggers ArithmeticException
        System.out.println("Result: " + result);
    }
}
