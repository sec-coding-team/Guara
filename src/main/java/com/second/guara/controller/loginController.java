package com.second.guara.controller;

import com.second.guara.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class loginController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Object login(String username,String password){
        return userService.login(username,password);
    }
}
