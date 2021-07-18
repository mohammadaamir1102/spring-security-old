package com.security.controller;

import com.security.models.User;
import com.security.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class MainController {

    @Autowired
    private userService userService;

    @GetMapping("/")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping("/{userName}")
    public User userGetByName(@PathVariable("userName") String userName){
        return userService.userGetByName(userName);
    }

    @PostMapping
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }
}
