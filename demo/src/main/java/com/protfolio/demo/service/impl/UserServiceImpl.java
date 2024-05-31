package com.protfolio.demo.service.impl;

import com.protfolio.demo.DTO.UserDto;
import com.protfolio.demo.model.User;
import com.protfolio.demo.repsitory.UserRepository;
import com.protfolio.demo.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    public UserRepository userRepository;


    @Override
    public List<UserDto> findAllUser() {
        List<User> users=userRepository.findAll();
        return users.stream().map(this::mapToClubDto).collect(Collectors.toList());
    }

    @Override
    public List<UserDto> findAllUserByName(String name) {
        List<User> users= userRepository.findAllByName(name);
        return users.stream().map(this::mapToClubDto).collect(Collectors.toList());
    }

    @Override
    public void createUser(User user) {
        Date currentDate = new Date();
        user.setCreated_on(currentDate.toString());
        user.setUsr_lvl("user");
        userRepository.save(user);
    }

    public UserDto mapToClubDto(User user){
        return UserDto.builder()
                .user_name(user.getUser_name())
                .name(user.getName())
                .created_on(user.getCreated_on())
                .update_on(user.getUpdate_on())
                .build();

    }
}
