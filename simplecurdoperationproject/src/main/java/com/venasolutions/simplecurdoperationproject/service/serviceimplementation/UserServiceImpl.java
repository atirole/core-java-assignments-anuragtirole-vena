package com.venasolutions.simplecurdoperationproject.service.serviceimplementation;

import com.venasolutions.simplecurdoperationproject.exception.UserNotFoundException;
import com.venasolutions.simplecurdoperationproject.model.User;
import com.venasolutions.simplecurdoperationproject.service.UserService;
import org.springframework.stereotype.Service;



import java.util.*;

/**
 * Implementation of UserService that uses in-memory storage.
 */
@Service
public class UserServiceImpl implements UserService
{

    private final Map<Integer, User> userMap = new HashMap<>();
    private int currentId = 1; // ID auto-increment logic

    @Override
    public User createUser(User user)
    {
        user.setId(currentId++);
        userMap.put(user.getId(), user);
        return user;
    }

    @Override
    public List<User> getAllUsers()
    {
        return new ArrayList<>(userMap.values());
    }

    @Override
    public User getUserById(int id)
    {
        User user = userMap.get(id);
        if (user == null) {
            throw new UserNotFoundException("User with ID " + id + " not found.");
        }
        return user;
    }

    @Override
    public User updateUser(int id, User updatedUser)
    {
        User existingUser = getUserById(id);
        existingUser.setName(updatedUser.getName());
        existingUser.setEmail(updatedUser.getEmail());
        return existingUser;
    }

    @Override
    public void deleteUser(int id)
    {
        if (!userMap.containsKey(id))
        {
            throw new UserNotFoundException("Cannot delete. User with ID " + id + " does not exist.");
        }
        userMap.remove(id);
    }

    @Override
    public User updateUserFields(int id, Map<String, Object> updates)
    {
        User user = userMap.get(id);
        if (user == null) throw new UserNotFoundException("User not found");

        // Only update the fields that are provided
        if (updates.containsKey("name")) {
            user.setName((String) updates.get("name"));
        }
        if (updates.containsKey("email")) {
            user.setEmail((String) updates.get("email"));
        }

        // Save the updated user
        userMap.put(id, user);
        return user;
    }




}
