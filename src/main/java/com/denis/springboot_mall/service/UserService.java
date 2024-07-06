package com.denis.springboot_mall.service;

import com.denis.springboot_mall.dto.UserLoginRequest;
import com.denis.springboot_mall.dto.UserRegisterRequest;
import com.denis.springboot_mall.model.User;

public interface UserService {
    Integer register(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);

    User login(UserLoginRequest userLoginRequest);
}
