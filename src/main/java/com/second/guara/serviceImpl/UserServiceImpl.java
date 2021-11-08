package com.second.guara.serviceImpl;

import com.second.guara.entity.response.RespondData;
import com.second.guara.entity.response.Response;
import com.second.guara.mapper.UserMapper;
import com.second.guara.utils.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.second.guara.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
    /**
     * 数据库操作器
     */
    @Autowired
    private UserMapper userMapper;
    private final int LOGIN_SUCCESS = 200;
    private final int None_Username = 401;
    private final int Error_Password = 402;

    /**
     * @param username 用户名
     * @param password 用户密码
     * @return 登录反馈对象
     */
    public Object login(String username, String password) {
        if (userMapper.hasUser(username)) {
            if (userMapper.findUserByUsernameAndPassword(username, password)) {
                int userId = userMapper.findUserIdByUsername(username);
                RespondData data = new RespondData(userId, userMapper.findNicknameByUsername(username), JwtUtils.getToken(userId));
                return new Response(true, LOGIN_SUCCESS, "Login Success", data);
//                return new RespondData(userId, userMapper.findNicknameByUsername(username), JwtUtils.getToken(userId));
            } else {
                return new Response(false, Error_Password, "Wrong Password", null);
            }
        } else {
            return new Response(false, None_Username, "Username does’t exist", null);
        }
    }
}
