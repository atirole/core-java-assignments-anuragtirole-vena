package Exception_Handling_Assignments.Task_12_global_exception_handler;
//GlobalExceptionHandler
public class Main
{
    public static void main(String[] args)
    {
        // Set global (default) uncaught exception handler
        Thread.setDefaultUncaughtExceptionHandler((thread, exception) ->
        {
            System.err.println("Global handler caught exception in thread: " + thread.getName());
            System.err.println("Exception message: " + exception.getMessage());
            exception.printStackTrace(System.err);
        });

        // Thread 1 that throws a RuntimeException
        Thread thread1 = new Thread(() ->
        {
            throw new RuntimeException("Exception from Thread-1");
        });

        // Thread 2 that throws another RuntimeException
        Thread thread2 = new Thread(() ->
        {
            throw new RuntimeException("Exception from Thread-2");
        });

        thread1.start();
        thread2.start();

        try
        {
            thread1.join();
            thread2.join();
        }
        catch (InterruptedException e)
        {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main thread exiting.");
    }
}
