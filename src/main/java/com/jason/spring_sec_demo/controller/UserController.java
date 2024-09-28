package com.jason.spring_sec_demo.controller;

import com.jason.spring_sec_demo.model.User;
import com.jason.spring_sec_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping("register")
    public User Register(@RequestBody User user){
        return service.saveUser(user);
    }
}
