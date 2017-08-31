package com.litesky.dao;

import com.litesky.model.User;

public interface UserDao {
    public User findUserByName(String username);
}
