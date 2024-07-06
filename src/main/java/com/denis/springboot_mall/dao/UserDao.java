package com.denis.springboot_mall.dao;

import com.denis.springboot_mall.dto.UserRegisterRequest;
import com.denis.springboot_mall.model.User;

public interface UserDao {
    Integer createUser(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);

    User getUserByEmail(String email);
}
