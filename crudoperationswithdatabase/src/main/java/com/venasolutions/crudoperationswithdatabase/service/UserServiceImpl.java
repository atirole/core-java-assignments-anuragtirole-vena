package com.venasolutions.crudoperationswithdatabase.service;

import com.venasolutions.crudoperationswithdatabase.entity.User;
import com.venasolutions.crudoperationswithdatabase.exceptions.ResourceNotFoundException;
import com.venasolutions.crudoperationswithdatabase.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(int id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with ID: " + id));
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(int id, User updatedUser) {
        User existingUser = getUserById(id);
        existingUser.setName(updatedUser.getName());
        existingUser.setEmail(updatedUser.getEmail());
        return userRepository.save(existingUser);
    }

    @Override
    public void deleteUser(int id) {
        User user = getUserById(id); // Will throw exception if not found
        userRepository.delete(user);
    }
}


