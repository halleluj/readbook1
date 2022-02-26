package com.test.utils;

import org.springframework.util.DigestUtils;

public class Md {
    /**D5加密方法
     * 将字符串转化为 32 位的MD5字符串
     * @param str 需要加密的字符串
     * Spring提供的M
     * @return String 加密后的MD5字符串
     */
    public static String Encrypted_MD5(String str){
        return DigestUtils.md5DigestAsHex(str.getBytes());
    }

}
