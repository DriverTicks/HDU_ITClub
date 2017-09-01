package com.litesky.dao;

import com.litesky.model.User;
import org.springframework.cglib.core.TinyBitSet;

public interface UserDao {
    public User findUserByName(String username);

    public int insertUser(User user);
}
