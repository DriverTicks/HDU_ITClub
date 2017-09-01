package com.litesky.dao.impl;

import com.litesky.dao.UserDao;
import com.litesky.model.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class UserDaoImpl implements UserDao {

    @Resource
    private SqlSessionTemplate sqlSessionTemplate;
    @Override
    public User findUserByName(String username) {
        return sqlSessionTemplate.selectOne("com.litesky.mapper.UserMapper.findUserByName",username);
    }

    @Override
    public int insertUser(User user) {
        return sqlSessionTemplate.insert("com.litesky.mapper.UserMapper.insertUser",user);
    }
}
