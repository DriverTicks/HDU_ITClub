package com.litesky.controller;

import com.litesky.model.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.apache.shiro.subject.Subject;


@Controller
@RequestMapping("/")
public class LoginController extends BaseController {

    @RequestMapping(value = "",method = RequestMethod.GET)
    public String homeIndex()
    {
        return "redirect:/home";
    }

    @RequestMapping(value = "login",method = RequestMethod.GET)
    public String index()
    {
        return "user/login";
    }

    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String login(User user)
    {
        System.out.println(user.getName()+":"+user.getPassword());
        Subject subject= SecurityUtils.getSubject();
        if (user.getName()==null||user.getName().isEmpty()||user.getPassword()==null||user.getPassword().isEmpty())
        {
            return "redirect:/login";
        }
        UsernamePasswordToken usernamePasswordToken=new UsernamePasswordToken(user.getName(),user.getPassword());
        try
        {
            subject.login(usernamePasswordToken);
            if (subject.isPermitted("home:*"));
            return "redirect:/home";
        }catch (AuthenticationException e)
        {
            return "redirect:/login";
        }
    }

    @RequestMapping("logout")
    public String logout()
    {
        Subject subject=SecurityUtils.getSubject();
        subject.logout();
        return "redirect:/logout";
    }

    @RequestMapping("404")
    public String get404()
    {
        return "common/404";
    }

}
