package com.venasolutions.simplecurdoperationproject.service;

import com.venasolutions.simplecurdoperationproject.model.User;

import java.util.List;
import java.util.Map;

/**
 * Interface defining CRUD operations for User.
 */
public interface UserService
{    // abstract methods
    User createUser(User user);
    List<User> getAllUsers();
    User getUserById(int id);
    User updateUser(int id, User user);
    void deleteUser(int id);
    User updateUserFields(int id, Map<String, Object> updates);

}
