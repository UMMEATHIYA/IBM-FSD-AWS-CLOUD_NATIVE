package com.example.userspringsecurity.service;


import com.example.userspringsecurity.dto.UserDto;
import com.example.userspringsecurity.model.UserModel;

import java.util.List;

public interface UserService {
        public UserDto createUser(UserDto userDto);
        public UserDto findByUserId(String userId);
        public UserDto findByEmail(String email);
        public List<UserModel> getAllUserDetails();
        public UserModel updateUser(String userId, UserDto userDto);
        public Integer deleteByUserId(String userId);
        public List<UserModel> getUserByFirstName(String firstName);
}
