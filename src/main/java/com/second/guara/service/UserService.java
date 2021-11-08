package com.second.guara.service;

public interface UserService {
    /**
     * 用户登录服务
     * @param username 用户名
     * @param password 用户密码
     * @return 登录反馈对象
     */
    Object login(String username, String password);
}
