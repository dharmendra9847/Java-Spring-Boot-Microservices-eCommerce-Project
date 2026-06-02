package com.ecommerceapplication.ecommerceapplication.service;

import com.ecommerceapplication.ecommerceapplication.dto.UserDto;
import com.ecommerceapplication.ecommerceapplication.entites.UserEntity;
import com.ecommerceapplication.ecommerceapplication.repositories.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<UserDto> fetchAllUsers() {
        return userRepository.findAll().stream()
                .map(userEntity -> modelMapper.map(userEntity, UserDto.class))
                .toList();
    }

    @Override
    public UserDto getUserById(Long id) {
        UserEntity userEntity = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));

        return modelMapper.map(userEntity, UserDto.class);
    }

    @Override
    public void addUser(UserDto userDto) {
        UserEntity userEntity = modelMapper.map(userDto, UserEntity.class);
        userRepository.save(userEntity);
    }

    @Override
    public UserDto updateUser(Long id, UserDto userDto) {
        // 1. Check if user exists
        UserEntity existingUser = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));

        // 2. Update the fields (ModelMapper can also do this, but manual is safer for partial updates)
        existingUser.setFirstName(userDto.getFirstName());
        existingUser.setLastName(userDto.getLastName());

        // 3. Save updated entity (updatedAt will auto-update thanks to @UpdateTimestamp)
        UserEntity savedUser = userRepository.save(existingUser);

        // 4. Return the updated DTO
        return modelMapper.map(savedUser, UserDto.class);
    }

    @Override
    public void deleteUserById(Long id) {
        // 1. Check if user exists
        UserEntity existingUser = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));
        userRepository.delete(existingUser);
    }
}
