package com.litesky.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.litesky.model.Page;
import com.litesky.model.RepairBill;
import com.litesky.service.RepairBillService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Resource
    private RepairBillService repairBillService;

    @RequestMapping("")
    public String index()
    {
        return "home/index";
    }


    @RequestMapping("/inbox")
    public String inbox()
    {
        return "home/inbox";
    }

    @RequestMapping("/personCenter")
    public String personCenter(HttpSession session)
    {
        System.out.println("我是："+session.getAttribute("username"));
        return "user/userInfo";
    }

    @RequestMapping("/alterUserState")
    public String userStateAlter()
    {
        return "user/userState";
    }

    @RequestMapping("/setting")
    public String setting()
    {
        return "home/setting";
    }

    @RequestMapping("mybills")
    public String myBills()
    {
        return "home/mybills";
    }

    @RequestMapping(value = "mybill",method = RequestMethod.GET)
    @ResponseBody
    public  List<RepairBill> mybill()
    {
       return repairBillService.getAllBills();

    }
}
