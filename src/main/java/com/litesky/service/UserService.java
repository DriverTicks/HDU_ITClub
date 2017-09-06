package com.litesky.service;

import com.litesky.model.User;

import java.util.List;

public interface UserService {

    public User findUserByName(String username);

    public int insertUser(User user);

    public List<User> getAllUser();
}
