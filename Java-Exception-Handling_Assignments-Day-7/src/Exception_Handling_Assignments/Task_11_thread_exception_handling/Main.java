package Exception_Handling_Assignments.Task_11_thread_exception_handling;
// ThreadExceptionHandler
public class Main
{
    public static void main(String[] args)
    {
        // Create a new thread
        Thread thread = new Thread(() ->
        {
            System.out.println("Child thread started.");
            try
            {
                Thread.sleep(1000);
            } catch (InterruptedException e)
            {
                System.out.println("Child thread interrupted.");
            }
            // Simulate an unexpected runtime error
            throw new RuntimeException("Simulated exception from child thread");
        });

        // Set uncaught exception handler
        thread.setUncaughtExceptionHandler((t, e) ->
        {
            System.err.println("Exception caught from thread: " + t.getName());
            System.err.println("Exception message: " + e.getMessage());
        });

        thread.start();

        try
        {
            thread.join(); // Wait for the child thread to finish
        }
        catch (InterruptedException e)
        {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main thread exiting.");
    }
}
