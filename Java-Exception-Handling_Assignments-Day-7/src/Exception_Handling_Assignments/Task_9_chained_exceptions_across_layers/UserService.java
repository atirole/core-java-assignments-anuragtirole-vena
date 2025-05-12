package Exception_Handling_Assignments.Task_9_chained_exceptions_across_layers;

import java.sql.SQLException;

// @Service
public class UserService
{
    private final UserRepository repository = new UserRepository();

    public void getUser(int userId) throws ServiceLayerException {
        try {
            repository.fetchUserById(userId);
        } catch (SQLException e) {
            throw new ServiceLayerException("Service failed while retrieving user", e);
        }
    }
}
