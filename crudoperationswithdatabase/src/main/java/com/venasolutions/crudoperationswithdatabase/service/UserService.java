package com.venasolutions.crudoperationswithdatabase.service;

import com.venasolutions.crudoperationswithdatabase.entity.User;

import java.util.List;

public interface UserService {
    User createUser(User user);
    User getUserById(int id);
    List<User> getAllUsers();
    User updateUser(int id, User user);
    void deleteUser(int id);
}

