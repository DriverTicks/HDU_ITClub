package com.litesky.controller;

import com.alibaba.fastjson.JSONObject;
import com.litesky.model.User;
import com.litesky.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.print.DocFlavor;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;
    @PostMapping("/getUser")
    @ResponseBody
    public User getUser(@RequestBody User user)
    {
        System.out.println(user.getName());
        return userService.findUserByName(user.getName());
    }

    @RequestMapping(value = "/alterUserState",method = RequestMethod.POST)
    public String alterUserState()
    {
        Subject subject= SecurityUtils.getSubject();
        Session session=subject.getSession();
        return null;
    }
}
