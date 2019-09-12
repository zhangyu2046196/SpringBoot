package com.youyuan.task.controller;

import com.youyuan.task.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangyu
 * @version 1.0
 * @description 控制类
 * @date 2018/12/27 15:50
 */
@RestController
public class AsyncController {
    @Autowired
    private AsyncService asyncService;

    @GetMapping("/hello")
    public String hello(){
        asyncService.hello();
        return "success";
    }
}
