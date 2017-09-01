package com.litesky.common.util;

import org.apache.shiro.crypto.hash.Md5Hash;

public class MD5Util {
        private static final String slat="#hdu.itclub%$";

        public static String md5(String str,String salt){
            return new Md5Hash(str,salt).toString() ;
        }

        public static void main(String[] args) {
            String md5 = md5("admin",slat) ;
            System.out.println(md5);
        }

}
