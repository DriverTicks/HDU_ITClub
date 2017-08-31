package com.litesky.controller;

import com.alibaba.fastjson.JSONObject;
import com.litesky.model.User;
import com.litesky.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
}
