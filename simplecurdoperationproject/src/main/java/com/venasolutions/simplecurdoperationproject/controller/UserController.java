package com.venasolutions.simplecurdoperationproject.controller;

import com.venasolutions.simplecurdoperationproject.model.User;
import com.venasolutions.simplecurdoperationproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * REST Controller to expose CRUD endpoints for User.
 */
@RestController
@RequestMapping("/users")
public class UserController
{

    private final UserService userService;

    @Autowired  // Automatically injects the implementation
    public UserController(UserService userService)
    {
        this.userService = userService;
    }

    // POST /users → Create a new user
    @PostMapping
    public User createUser(@RequestBody User user)
    {
        return userService.createUser(user);
    }

    // GET /users → Retrieve all users
    @GetMapping
    public List<User> getAllUsers()
    {
        return userService.getAllUsers();
    }

    // GET /users/{id} → Retrieve a user by ID
    @GetMapping("{id}")
    public User getUserById(@PathVariable int id)
    {
        return userService.getUserById(id);
    }

    // PUT /users/{id} → Update a user by ID
    @PutMapping("{id}")
    public User updateUser(@PathVariable int id, @RequestBody User user)
    {
        return userService.updateUser(id, user);
    }

    // DELETE /users/{id} → Delete a user by ID
    @DeleteMapping("{id}")
    public void deleteUser(@PathVariable int id)
    {
        userService.deleteUser(id);
    }
    @PatchMapping("/{id}")
    public ResponseEntity<User> updateUserPartially(
            @PathVariable int id,
            @RequestBody Map<String, Object> updates)
    {
        return ResponseEntity.ok(userService.updateUserFields(id, updates));
    }

}
