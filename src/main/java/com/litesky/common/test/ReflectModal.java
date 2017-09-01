package com.litesky.common.test;

import java.lang.reflect.Field;

/**
 * Created by zarker on 2017/7/25.
 */
public class ReflectModal {
    //遍历类的成员变量，然后组合输出
    public static void printFieldMessage(Object obj) {
        Class c=obj.getClass();
        Field[] fs=c.getDeclaredFields();
        String abc="";
        String bc="";
        String cc="";
        StringBuffer sbf=new StringBuffer();
        for(Field field:fs){
            //得到成员变量的名字
            String fieldName=field.getName();
            abc+=fieldName+",";
            bc+="#{"+fieldName+"},";
            cc+="\""+fieldName+"\",";
            sbf.append("\n<if test=\""+fieldName+"!=null and "+fieldName+"!=''\"> \n and "+fieldName+"=#{"+fieldName+"}  \n</if>");
        }
        System.out.println(abc);
        System.out.println(bc);
        System.out.println(cc);
        System.out.println(sbf.toString());
    }
}
