package com.youyuan.devtools.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zhangyu
 * @version 1.0
 * @description 开发热部署测试
 * @date 2018/12/28 23:11
 */
@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
