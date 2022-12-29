package com.example.springboot_02.util;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 * className:${胡俊奕}
 * Package:com.example.springboot_02.util
 * Description:好好学习，天天向上！
 *
 * @Date: 2022/10/30 21:50
 * @Author:2692243932@qq.com
 */
@Component
public class CodeUtil {
    private String [] path = {"000000","00000","0000","000","00","0",""};

    public String generator(String tele){
        int hash = tele.hashCode();
        int encryption = 20202020;
        long result = hash ^ encryption;
        long nowTime = System.currentTimeMillis();
        result = result ^ nowTime;
        long code = result % 1000000;
        code = code < 0 ? -code : code;
        String codeStr = code + "";
        int len = codeStr.length();
        return path[len] + codeStr;
    }

    @Cacheable(value = "CodeSpace",key = "#tele")
    public String get(String tele){
        return null;
    }

}
