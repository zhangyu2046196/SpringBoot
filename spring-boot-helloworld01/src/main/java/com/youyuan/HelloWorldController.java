package com.youyuan;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhangyu
 * @version 1.0
 * @description 测试@SpringBootApplication标记的类的外面能否被springboot自动扫描 (springboot只能将主程序所在的包及子包下面的类自动注册到ioc容器)
 * @date 2018/12/10 11:20
 */
@Controller
public class HelloWorldController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello world bei mei content ......";
    }
}
