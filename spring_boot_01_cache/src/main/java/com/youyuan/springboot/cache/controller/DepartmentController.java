package com.youyuan.springboot.cache.controller;

import com.youyuan.springboot.cache.bean.Department;
import com.youyuan.springboot.cache.service.DepartMentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangyu
 * @version 1.0
 * @description 部门控制类接口
 * @date 2018/12/20 14:10
 */
@RestController
public class DepartmentController {

    @Autowired
    private DepartMentService departMentService;

    @GetMapping("/dept/{id}")
    public Department getDeptById(@PathVariable("id") Integer id){
        return departMentService.getDeptById(id);
    }
}
