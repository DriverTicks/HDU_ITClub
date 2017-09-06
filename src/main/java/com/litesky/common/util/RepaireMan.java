package com.litesky.common.util;

import com.litesky.model.User;
import com.litesky.service.UserService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by finefine.com on 2017/9/6.
 */
public class RepaireMan {



    public static int i=0;
    public static List<User> userList=new ArrayList<User>();

    /**
     * 添加一个user
     * @param user
     */
    public void addUser(User user)
    {
        userList.add(user);

    }

    /**
     * 添加集合中所有的user
     * @param users
     */
    public void addUsers(List<User> users)
    {
        userList.addAll(users);
    }

    /**
     * 按顺序获取user
     * @return
     */
    public User getUser()
    {
        if (userList.size()<=0)
        {
            return null;
        }

        if (i<userList.size())
        {
            User userTemp= userList.get(i);
            i++;
            return userTemp;
        }else
        {
            i=0;
            return getUser();
        }
    }

    public void removeOffUsers()
    {
        for (User user:userList)
        {
            if (user.getState()==0);
            userList.remove(user);
        }
    }
}
