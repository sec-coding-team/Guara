package com.second.guara.service;

import com.second.guara.entity.Response;

public interface UserService {
    Response login(String username, String password);
}
