package com.litesky.service;

import com.litesky.model.Permission;
import com.litesky.model.User;

import java.util.List;
import java.util.Map;

public interface PermissonService {
    public int insertPermission(Permission permission);

    public int insertRole_Permission(Map<String,Object> map);

    public List<String> findRolebyUserid(int id);

    public List<String> findPermissionbyUserid(int id);

    public List<User> finduserbyNP(Map<String,Object> map);

    public int deleteSameRole_Permission();

    public int deleteSamePermission();
}
