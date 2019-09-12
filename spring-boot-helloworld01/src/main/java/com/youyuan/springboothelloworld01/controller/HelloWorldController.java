package com.youyuan.springboothelloworld01.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhangyu
 * @version 1.0
 * @description helloworld测试
 * @date 2018/12/9 21:58
 */
@Controller
public class HelloWorldController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World ..........";
    }
}
