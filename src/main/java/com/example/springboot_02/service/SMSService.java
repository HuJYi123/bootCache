package com.example.springboot_02.service;

import com.example.springboot_02.domain.SMSCode;

/**
 * className:${胡俊奕}
 * Package:com.example.springboot_02.server
 * Description:好好学习，天天向上！
 *
 * @Date: 2022/10/30 21:56
 * @Author:2692243932@qq.com
 */
public interface SMSService {

    public String getCode(String tele);

    public boolean checkCode(SMSCode smsCode);

}
