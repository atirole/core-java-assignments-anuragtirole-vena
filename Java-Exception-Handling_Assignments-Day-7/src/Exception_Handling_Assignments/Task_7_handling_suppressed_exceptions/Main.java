package Exception_Handling_Assignments.Task_7_handling_suppressed_exceptions;

public class Main
{
    public static void main(String[] args)
    {
        // try with resources;
        try (
                CustomResource res1 = new CustomResource("Resource1");
                CustomResource res2 = new CustomResource("Resource2");
            )
        {
            res1.use();
            res2.use();
            System.out.println("Using both resources.");
        }
        catch (Exception e)
        {
            System.err.println("Primary exception: " + e.getMessage());

            // Display suppressed exceptions (if any)
            for (Throwable suppressed : e.getSuppressed())
            {
                System.err.println("Suppressed: " + suppressed.getMessage());
            }
        }
    }
}