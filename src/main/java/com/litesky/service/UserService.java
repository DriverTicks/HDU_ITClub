package com.litesky.service;

import com.litesky.model.User;

public interface UserService {

    public User findUserByName(String username);

    public int insertUser(User user);


}
