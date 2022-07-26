package com.socialmediaapplication.controller;

import com.socialmediaapplication.model.User;
import com.socialmediaapplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value = "/signup", consumes = "application/json")
    public String signup(@RequestBody User user){

        String response = userService.register(user);

        return response;
    }
}
