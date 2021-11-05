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

    public boolean findUserByUsernameAndPassword(String username, String password) {
        List<Map<String, Object>> userList = jdbcTemplate.queryForList(FIND_USER_BY_USERNAME_PASSWORD, username, password);
        return userList.size() == 1;
    }

    public int findUserIdByUsername(String username) {
        try {
            return jdbcTemplate.queryForObject(FIND_USERID_BY_USERNAME, Integer.class, username);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}
