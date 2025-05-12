package Exception_Handling_Assignments.Task_4_re_throwing_exceptions_with_additional_context;

public class Main
{
    public static void main(String[] args)
    {
        ReThrowing handler = new ReThrowing();

        try
        {
            handler.execute();
        }
        catch (CustomException e)
        {
            System.err.println("Caught CustomException: " + e.getMessage());
            System.err.println("Original cause: " + e.getCause());
            e.printStackTrace();
        }
    }
}
