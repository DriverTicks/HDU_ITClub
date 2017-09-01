package com.litesky.Realm;

import com.litesky.common.util.MD5Util;
import com.litesky.model.User;
import com.litesky.service.PermissonService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.subject.PrincipalCollection;

import javax.annotation.Resource;
import javax.jws.soap.SOAPBinding;
import java.util.*;

public class MyRealm extends AuthorizingRealm {
    private static final String slat="#hdu.itclub%$";

    @Resource
    private PermissonService permissonService;

    /**
     * 授权
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        User user= (User) principals.getPrimaryPrincipal();
        SimpleAuthorizationInfo authorizationInfo=new SimpleAuthorizationInfo();
        Set<String> roleName=new HashSet<>();
        roleName.addAll(permissonService.findRolebyUserid(user.getId()));
        Set<String> permissions=new HashSet<>();
        permissions.addAll(permissonService.findPermissionbyUserid(user.getId()));
        authorizationInfo.setRoles(roleName);
        authorizationInfo.setStringPermissions(permissions);
        return authorizationInfo;
    }

    /**
     * 身份验证
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        UsernamePasswordToken usernamePasswordToken= (UsernamePasswordToken) token;
        Map<String,Object> userInfoMap=new HashMap<>();
        userInfoMap.put("username",usernamePasswordToken.getUsername());
        userInfoMap.put("password", MD5Util.md5(String.valueOf(usernamePasswordToken.getPassword()),slat));
        try
        {
            List<User> users=permissonService.finduserbyNP(userInfoMap);
            if (users!=null&&users.size()>0)
            {
                User user=users.get(0);
                AuthenticationInfo authenticationInfo=new SimpleAuthenticationInfo(user,usernamePasswordToken.getPassword(),user.getName());
                return authenticationInfo;
            }else
            {
                return null;
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }

        return null;
    }
}
