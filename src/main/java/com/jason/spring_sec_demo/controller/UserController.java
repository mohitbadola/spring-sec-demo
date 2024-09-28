package com.jason.spring_sec_demo.controller;

import com.jason.spring_sec_demo.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @PostMapping("register")
    public User Register(@RequestBody User user){
        return user;
    }
}
