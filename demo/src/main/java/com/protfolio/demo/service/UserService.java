package com.protfolio.demo.service;

import com.protfolio.demo.DTO.UserDto;
import com.protfolio.demo.model.User;

import java.util.List;


public interface UserService {
    List<UserDto> findAllUser();
    List<UserDto> findAllUserByName(String name);
    void createUser(User user);
}
