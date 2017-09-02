package com.litesky.common.util;

import org.apache.shiro.crypto.hash.Md5Hash;

public class MD5Util {
        private static final String salt="#hdu.itclub%$";

        public static String md5(String str){
            return new Md5Hash(str,salt).toString() ;
        }
}
