package com.ecommerceapplication.ecommerceapplication.service;

import com.ecommerceapplication.ecommerceapplication.dto.UserDto;

import java.util.List;

public interface UserService {

    List<UserDto> fetchAllUsers();
    UserDto getUserById(Long id);
    void addUser(UserDto userDto);
    UserDto updateUser(Long id, UserDto userDto);
    void deleteUserById(Long id);

}
