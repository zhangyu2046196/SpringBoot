package com.youyuan.controller;

import com.youyuan.user.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangyu
 * @version 1.0
 * @description
 * @date 2018/12/28 15:23
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/ticket")
    public String getTickets(){
        userService.getTicket();
        return "success";
    }
}
