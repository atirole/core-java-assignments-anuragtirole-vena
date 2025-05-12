package Exception_Handling_Assignments.Task_9_chained_exceptions_across_layers;

//@Controller
public class UserController
{
    private final UserService service = new UserService();

    public void handleUserRequest(int userId)
    {
        try
        {
            service.getUser(userId);
        } catch (ServiceLayerException e)
        {
            System.err.println("Controller: Failed to handle user request");
            System.err.println("Root Cause: " + e.getCause().getMessage());
            e.printStackTrace();
        }
    }
}
