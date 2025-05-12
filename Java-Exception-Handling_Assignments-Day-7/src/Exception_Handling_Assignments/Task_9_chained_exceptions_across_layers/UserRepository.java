package Exception_Handling_Assignments.Task_9_chained_exceptions_across_layers;

import java.sql.SQLException;

// @Repository
public class UserRepository
{
    public void fetchUserById(int userId) throws SQLException
    {
        // Simulated DB failure
        throw new SQLException("Unable to fetch user from database");
    }
}
