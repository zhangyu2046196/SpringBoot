package com.youyuan.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Map;

/**
 * @author zhangyu
 * @version 1.0
 * @description 测试
 * @date 2018/12/11 15:34
 */
@Controller
public class HelloWorldController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }
    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hello","你好");
        map.put("users", Arrays.asList("北京","上海","广州"));
        return "success";
    }

    /*@RequestMapping({"/","/index.html"})
    public String index(){
        return "login";
    }*/
}
