package com.example.springboot_02.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * className:${胡俊奕}
 * Package:com.example.springboot_02.domain
 * Description:好好学习，天天向上！
 *
 * @Date: 2022/10/30 23:44
 * @Author:2692243932@qq.com
 */

@Data
public class SMSCode implements Serializable {
    private String code;
    private String tele;
}
