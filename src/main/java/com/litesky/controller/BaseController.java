package com.litesky.controller;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by finefine.com on 2017/8/30.
 */
public class BaseController {

    public Map<String,Object> returnMap(Integer code,String msg,Object data){
        Map<String,Object> map =new HashMap<>();
        map.put("code",code);
        map.put("msg",msg);
        if (data!=null)
        {
            map.put("data",data);
        }
        return map;
    }
}
