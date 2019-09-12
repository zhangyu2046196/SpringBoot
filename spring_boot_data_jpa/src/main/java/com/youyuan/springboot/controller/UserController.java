package com.youyuan.springboot.controller;

import com.youyuan.springboot.entity.User;
import com.youyuan.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangyu
 * @version 1.0
 * @description 测试springboot整合jpa
 * @date 2018/12/17 22:43
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") Integer id){
        return userRepository.getOne(id);
    }

    @GetMapping("/user")
    public User insert(User user){
        return userRepository.save(user);
    }
}
