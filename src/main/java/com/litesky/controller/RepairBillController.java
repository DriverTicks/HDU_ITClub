package com.litesky.controller;

import com.litesky.common.util.RepaireMan;
import com.litesky.email.SendEmail;
import com.litesky.model.Message;
import com.litesky.model.RepairBill;
import com.litesky.model.User;
import com.litesky.service.EmailConfigService;
import com.litesky.service.RepairBillService;
import com.litesky.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by finefine.com on 2017/8/30.
 */
@Controller
@RequestMapping("/repairBill")
public class  RepairBillController extends BaseController{

    @Resource
    private UserService userService;
    @Resource
    private RepairBillService repairBillService;

    @Resource
    private EmailConfigService emailConfigService;

    @PostMapping("/insertBill")

    public ModelAndView insertRepairBill(RepairBill repairBill)
    {   RepaireMan repaireMan=new RepaireMan();
        repaireMan.addUsers(userService.getAllUser());
        ModelAndView modelAndView=new ModelAndView();

        int code=repairBillService.insertBill(repairBill);
        if (code!=0)
        {
            modelAndView.setViewName("customer/forRepairingOk");
            User user=repaireMan.getUser();
            modelAndView.addObject(user);
            Message message=new Message();
            message.setSubject("你收到了新的维修请求");
            message.setContent("姓名："+repairBill.getName()+"性别："+repairBill.getGender()+"QQ:"+repairBill.getQQ());
            SendEmail sendEmail=new SendEmail(emailConfigService.getConfig(),message,user.getEmail());
            sendEmail.sendEmail();
            return modelAndView;
        }else
        {
            modelAndView.setViewName("common/404");
            return modelAndView;
        }

    }


    @RequestMapping("/repairing")
    public String forRepairing()
    {
        return "customer/forRepairing";
    }

    @GetMapping("/allBill")
    @ResponseBody
    public Map<String,Object> getAllBill()
    {
        List<RepairBill> repairBills=repairBillService.getAllBills();
        if (repairBills!=null)
        {
            return returnMap(0,"查询成功",repairBills);
        }else
        {
            return returnMap(-1,"查询失败，数据库内部错误",repairBills);
        }
    }
}
