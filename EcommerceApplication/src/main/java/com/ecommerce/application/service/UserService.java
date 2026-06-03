package com.ecommerce.application.service;

import com.ecommerce.application.dto.UserRequest;
import com.ecommerce.application.dto.UserResponse;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<UserResponse> fetchAllUsers();
    Optional<UserResponse> fetchUser(Long id);
    void addUser(UserRequest userRequest);
    boolean updateUser(Long id, UserRequest updateUserRequest);
    void deleteUserById(Long id);

}
