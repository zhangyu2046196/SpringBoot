package com.youyuan.springboot.controller;

import com.youyuan.springboot.bean.DepartMent;
import com.youyuan.springboot.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangyu
 * @version 1.0
 * @description 测试部门增删改
 * springboot导入的mybatis-spring-boot-start会自动配置mybatis
 * @date 2018/12/17 16:30
 */
@RestController
public class DepartmentController {

    @Autowired
    private DepartmentMapper departmentMapper;

    /**
     * 查询
     * @param id
     * @return
     */
    @GetMapping("/dept/{id}")
    public DepartMent find(@PathVariable("id") Integer id){
        return departmentMapper.getDepartmentById(id);
    }

    /**
     * 保存
     * @param departMent
     * @return
     */
    @GetMapping("/dept")
    public void insert(DepartMent departMent){
        departmentMapper.insert(departMent);
    }

    /**
     * 修改
     * @param departMent
     * @return
     */
    @GetMapping("/dept/update")
    public int update(DepartMent departMent){
        return departmentMapper.update(departMent);
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @GetMapping("/dept/del/{id}")
    public int delete(@PathVariable("id") Integer id){
        return departmentMapper.delete(id);
    }
}
