package com.litesky.service.impl;

import com.litesky.dao.PermissionDao;
import com.litesky.model.Permission;
import com.litesky.model.User;
import com.litesky.service.PermissonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class PermissionServiceImpl implements PermissonService {

    @Resource
    private PermissionDao permissionDao;

    @Override
    public int insertPermission(Permission permission) {
        return permissionDao.insertPermission(permission);
    }

    @Override
    public int insertRole_Permission(Map<String, Object> map) {
        return permissionDao.insertRole_Permission(map);
    }

    @Override
    public List<String> findRolebyUserid(int id) {
        return permissionDao.findRolebyUserid(id);
    }

    @Override
    public List<String> findPermissionbyUserid(int id) {
        return permissionDao.findPermissionbyUserid(id);
    }

    @Override
    public List<User> finduserbyNP(Map<String, Object> map) {
        return permissionDao.finduserbyNP(map);
    }

    @Override
    public int deleteSameRole_Permission() {
        return permissionDao.deleteSameRole_Permission();
    }

    @Override
    public int deleteSamePermission() {
        return permissionDao.deleteSamePermission();
    }
}
