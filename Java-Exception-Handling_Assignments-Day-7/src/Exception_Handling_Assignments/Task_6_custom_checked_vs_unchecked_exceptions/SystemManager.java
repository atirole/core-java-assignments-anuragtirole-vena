package Exception_Handling_Assignments.Task_6_custom_checked_vs_unchecked_exceptions;

public class SystemManager {

    public void startSystem(boolean fatalError)
    {
        if (fatalError)
        {
            throw new CriticalSystemException("Critical failure: System is shutting down!");
        }
        System.out.println("System started successfully.");
    }
}
