package com.second.guara.serviceImpl;

import com.second.guara.entity.Response;
import com.second.guara.mapper.UserMapper;
import com.second.guara.utils.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.second.guara.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    private final int LOGIN_SUCCESS = 201;
    private final int LOGIN_ERROR = 401;
    private final int LOGIN_FAIL = 400;

    public Response login(String username, String password) {
        if (userMapper.findUserByUsernameAndPassword(username, password)) {
            int userId = userMapper.findUserIdByUsername(username);
            if (userId != -1) {
                return new Response(LOGIN_SUCCESS, JwtUtils.getToken(userId), "Login Success");
            } else {
                return new Response(LOGIN_ERROR, null, "Server Error");
            }
        } else {
            return new Response(LOGIN_FAIL, null, "Wrong Account or Password");
        }
    }
}
