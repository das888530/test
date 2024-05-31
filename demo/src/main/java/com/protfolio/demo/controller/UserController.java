package com.protfolio.demo.controller;

import com.protfolio.demo.DTO.UserDto;
import com.protfolio.demo.model.User;
import com.protfolio.demo.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserController {
    @Resource
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public String listUsers(Model model){
        List<UserDto> users;
        users = userService.findAllUser();
        model.addAttribute("users",users);
        return "users-list";
    }

    @GetMapping("/createNewUser")
    public String createUserForm(Model model){
        User user = new User();
        model.addAttribute("user",user);
        return "create-user";
    }
    @PostMapping("/user/new")
    public String saveUser(@ModelAttribute("user") User user){
        userService.createUser(user);
        return "redirect:/users";
    }

}
