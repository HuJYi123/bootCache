//package com.example.springboot_02.config;
//
//import ch.qos.logback.classic.spi.LoggingEventVO;
//import net.rubyeye.xmemcached.MemcachedClient;
//import net.rubyeye.xmemcached.MemcachedClientBuilder;
//import net.rubyeye.xmemcached.XMemcachedClientBuilder;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.io.IOException;
//
///**
// * className:XMemcachedConfig
// * Package:com.example.springboot_02.config
// * Description:一步一脚印！
// *
// * @Date: 2022/10/31 14:47
// * @Author:2692243932@qq.com
// */
//
//
//@Configuration
//public class XMemcachedConfig {
//
//    @Autowired
//    private PropertiesConfig propertiesConfig;
//
//
//    @Bean
//    public MemcachedClient getMemcachedClient() throws IOException {
//        MemcachedClientBuilder builder = new XMemcachedClientBuilder(propertiesConfig.getServers());
//        MemcachedClient memcachedClient = builder.build();
//        return memcachedClient;
//    }
//}
