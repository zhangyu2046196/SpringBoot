package com.youyuan.consumeruser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhangyu
 * @version 1.0
 * @description 服务消费者
 * @date 2018/12/28 22:20
 */
@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate; //服务消费者操作

    @GetMapping("/buy/{name}")
    public String buyTicket(@PathVariable("name") String name){
        //getForObject 是发送get请求返回Object对象，第一个参数是注册中心地址,不用写端口号,PROVIDER-TICKET是服务提供者注册到注册中心eureka的服务名字,ticket是请求地址,第二个参数是返回Object的类型
        String str = restTemplate.getForObject("http://PROVIDER-TICKET/ticket", String.class);
        return name+" 购买了 "+str+" 电影票";
    }
}
