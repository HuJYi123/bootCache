package com.example.springboot_02.service.impl;

import com.example.springboot_02.domain.SMSCode;
import com.example.springboot_02.service.SMSService;
import com.example.springboot_02.util.CodeUtil;
import net.rubyeye.xmemcached.MemcachedClient;
import net.rubyeye.xmemcached.exception.MemcachedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeoutException;

/**
 * className:${胡俊奕}
 * Package:com.example.springboot_02.service.impl
 * Description:好好学习，天天向上！
 *
 * @Date: 2022/10/30 21:57
 * @Author:2692243932@qq.com
 */

@Service
public class SMSServiceImpl implements SMSService {

    @Autowired
    private CodeUtil codeUtil;

//    @Autowired
//    private MemcachedClient memcachedClient;

    //使用xmemcached
//    @Override
//    public String getCode(String tele) {
//        String generator = codeUtil.generator(tele);
//        try {
//            memcachedClient.set(tele,100000,generator);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        return generator;
//    }
//
//    @Override
//    public boolean checkCode(SMSCode smsCode) {
//        String code = smsCode.getCode();
//        String result = null;
//        try {
//            result = memcachedClient.get(smsCode.getTele()).toString();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        return code.equals(result);
//    }



    //使用ehcache或redis
    @Override
    @CachePut(value = "CodeSpace",key = "#tele")
    public String getCode(String tele) {
        String generator = codeUtil.generator(tele);
        return generator;
    }

    @Override
    public boolean checkCode(SMSCode smsCode) {
        String code = smsCode.getCode();
        String s = codeUtil.get(smsCode.getTele());
        return code.equals(s);
    }
}
