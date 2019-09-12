package com.youyuan.springbootconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangyu
 * @version 1.0
 * @description 测试@Vaule获取配置文件单个属性值
 * @date 2018/12/10 16:59
 */
@RestController
public class HelloWorldController {
    @Value("${person.last-name}")
    private String name;
    @RequestMapping("/sayHello")
    public String sayHello(){
        return name;
    }
}
