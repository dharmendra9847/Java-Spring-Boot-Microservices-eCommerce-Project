package com.ecommerceapplication.ecommerceapplication.controller;

import com.ecommerceapplication.ecommerceapplication.dto.UserDto;
import com.ecommerceapplication.ecommerceapplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Fetching All Users
    @GetMapping("getAll")
    public ResponseEntity<List<UserDto>> getAllUsers() {
        return new ResponseEntity<>(userService.fetchAllUsers(), HttpStatus.OK);
    }

    // Fetching UserById
    @GetMapping("getById/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable Long id) {
        UserDto userDto = userService.getUserById(id);
        return ResponseEntity.ok(userDto);
    }

    // Adding New Users
    @PostMapping("create")
    public ResponseEntity<String> createUser(@RequestBody UserDto userDto) {
        userService.addUser(userDto);
        return ResponseEntity.ok("User added successfully");
    }

    // Update User Endpoint
    @PutMapping("update/{id}")
    public ResponseEntity<String> updateUser(@PathVariable Long id, @RequestBody UserDto userDto) {
        userService.updateUser(id, userDto);
        return ResponseEntity.ok("User updated successfully");
    }

    // Delete User Endpoint
    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        userService.deleteUserById(id);
        return ResponseEntity.ok("User deleted successfully");
    }
}
