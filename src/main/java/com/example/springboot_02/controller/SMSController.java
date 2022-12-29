package com.example.springboot_02.controller;

import com.example.springboot_02.domain.SMSCode;
import com.example.springboot_02.service.SMSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * className:${胡俊奕}
 * Package:com.example.springboot_02.controller
 * Description:好好学习，天天向上！
 *
 * @Date: 2022/10/30 21:49
 * @Author:2692243932@qq.com
 */

@RestController
@RequestMapping("/SMS")
public class SMSController {

    @Autowired
    private SMSService service;

    @GetMapping
    public String getCode(String tele){
        String code = service.getCode(tele);
        return code;
    }


    @PostMapping
    public boolean checkCode(SMSCode smsCode){
        return service.checkCode(smsCode);
    }
}
