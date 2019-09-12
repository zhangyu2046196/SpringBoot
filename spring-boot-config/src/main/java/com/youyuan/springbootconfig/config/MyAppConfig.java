package com.youyuan.springbootconfig.config;

import com.youyuan.springbootconfig.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangyu
 * @version 1.0
 * @description 配置类
 * @date 2018/12/10 17:28
 */
@Configuration
public class MyAppConfig {

    @Bean
    public HelloService helloService(){
        System.out.println("初始化配置类......");
        return new HelloService();
    }
}
