package com.second.guara.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class UserMapper {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private final String FIND_USER_BY_USERNAME_PASSWORD = "SELECT * FROM user WHERE username = ? AND password = ?";
    private final String FIND_USERID_BY_USERNAME = "SELECT id FROM user WHERE username = ?";
    private final String FIND_NICKNAME_BY_USERNAME = "SELECT nickname FROM user WHERE username = ?";

    /**
     * 在数据库里寻找是否有匹配的用户名和密码
     * @param username 用户名
     * @param password 用户密码
     * @return true 如果登陆成功<br/>false 如果登录失败
     */
    public boolean findUserByUsernameAndPassword(String username, String password) {
        List<Map<String, Object>> userList = jdbcTemplate.queryForList(FIND_USER_BY_USERNAME_PASSWORD, username, password);
        return userList.size() == 1;
    }

    /**
     * 通过用户名在数据库里查找用户id
     * @param username 用户名
     * @return 用户id 如果该用户名存在<br/>-1 如果用户名不存在
     */
    public int findUserIdByUsername(String username) {
        try {
            return jdbcTemplate.queryForObject(FIND_USERID_BY_USERNAME, Integer.class, username);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    /**
     * 通过用户名在数据库里查找昵称
     * @param username 用户名
     * @return 用户昵称
     */
    public String findNicknameByUsername(String username){
        try {
            return jdbcTemplate.queryForObject(FIND_NICKNAME_BY_USERNAME, String.class, username);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 判断是否有该用户名的用户
     * @param username 用户名
     * @return true 存在<br>false 不存在
     */
    public boolean hasUser(String username){
        return findUserIdByUsername(username) != -1;
    }
}
