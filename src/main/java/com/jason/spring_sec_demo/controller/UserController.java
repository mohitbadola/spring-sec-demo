package com.jason.spring_sec_demo.controller;

import com.jason.spring_sec_demo.model.User;
import com.jason.spring_sec_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
    @Autowired
    private UserService service;

    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping("register")
    public User Register(@RequestBody User user){
        return service.saveUser(user);
    }

    @PostMapping("login")
    public String login(@RequestBody User user){

        Authentication authentication = authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(),user.getPassword()));

        if(authentication.isAuthenticated())
            return "Success";
        else
            return "Login failed";

    }
}
