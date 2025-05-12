package Exception_Handling_Assignments.Task_9_chained_exceptions_across_layers;

public class Main
{
    public static void main(String[] args)
    {
        UserController controller = new UserController();
        controller.handleUserRequest(101); // Simulate request
    }
}
