package com.litesky.dao.impl;

import com.litesky.dao.PermissionDao;
import com.litesky.model.Permission;
import com.litesky.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class PermissionDaoImpl implements PermissionDao {

    @Override
    public int insertPermission(Permission permission) {
        return 0;
    }

    @Override
    public int insertRole_Permission(Map<String, Object> map) {
        return 0;
    }

    @Override
    public List<String> findRolebyUserid(int id) {
        return null;
    }

    @Override
    public List<String> findPermissionbyUserid(int id) {
        return null;
    }

    @Override
    public List<User> finduserbyNP(Map<String, Object> map) {
        return null;
    }

    @Override
    public int deleteSameRole_Permission() {
        return 0;
    }

    @Override
    public int deleteSamePermission() {
        return 0;
    }
}
