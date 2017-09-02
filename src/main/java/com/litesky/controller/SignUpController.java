package com.litesky.controller;

import com.litesky.common.util.MD5Util;
import com.litesky.dao.UserDao;
import com.litesky.model.User;
import com.litesky.service.UserService;
import org.omg.CORBA.OBJ_ADAPTER;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.annotation.Resources;
import java.util.Map;

@Controller
@RequestMapping("/")
public class SignUpController extends BaseController{

    @Resource
    private UserService userService;

    @RequestMapping(value = "signup",method = RequestMethod.GET)
    public String signup()
    {
        return "register";
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String register(User user)
    {
        System.out.println(user.toString()+"-------------------------------------------");
        System.out.println(user.toString());
        String username=user.getName();
        User userTemp=userService.findUserByName(username);
        if (userTemp!=null)
        {

            return "register";
        }
        user.setPassword(MD5Util.md5(user.getPassword()));
        int code=userService.insertUser(user);
        if(code!=0)
        {
            System.out.println("code"+code);
            return "redirect:/login";
        }else
        {
            System.out.println("code"+code);
            return "register";
        }

    }

    @Resource
    private UserDao userDao;

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> insertUser(User user)
    {

        int code=userDao.insertUser(user);
        if (code==0)
        {
            return returnMap(-1,"插入失败",null);
        }else
        {
            return returnMap(0,"插入成功",null);
        }
    }
}
