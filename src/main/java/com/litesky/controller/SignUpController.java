package com.litesky.controller;

import com.litesky.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class SignUpController {

    @RequestMapping(value = "signup",method = RequestMethod.GET)
    public String signup()
    {
        return "register";
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String register(User user)
    {
        return "redirect:/login";
    }
}
