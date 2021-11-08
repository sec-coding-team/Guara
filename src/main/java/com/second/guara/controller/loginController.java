package com.second.guara.controller;

import com.second.guara.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class loginController {
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public Object login(String username,String password){
        return userService.login(username,password);
    }
}
