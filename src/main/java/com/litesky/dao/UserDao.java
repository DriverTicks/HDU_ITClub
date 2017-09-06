package com.litesky.dao;

import com.litesky.model.User;
import org.springframework.cglib.core.TinyBitSet;

import java.util.List;

public interface UserDao {
    public User findUserByName(String username);

    public int insertUser(User user);

    public List<User> getAllUser();
}
