package com.socialmediaapplication.service;

import com.socialmediaapplication.model.User;
import com.socialmediaapplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public String register(User user){

        User userSaved = userRepository.save(user);

        if (userSaved != null)
            return "User has been registered!";
        else
            return "Error in registering user";
    }
}
