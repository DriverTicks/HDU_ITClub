package com.litesky.service.impl;

import com.litesky.dao.UserDao;
import com.litesky.model.User;
import com.litesky.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    @Override
    public User findUserByName(String username) {
        return userDao.findUserByName(username);
    }

    @Override
    public int insertUser(User user) {
        return userDao.insertUser(user);
    }

    @Override
    public List<User> getAllUser() {
        return userDao.getAllUser();
    }

}
