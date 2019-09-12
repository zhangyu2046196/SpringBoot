package com.youyuan.springboot.controller;

import com.youyuan.springboot.bean.Employee;
import com.youyuan.springboot.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangyu
 * @version 1.0
 * @description 员工控制类
 * @date 2018/12/17 18:03
 */
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeMapper employeeMapper;

    /**
     * 查询员工信息
     * @param id
     * @return
     */
    @GetMapping("/emp/{id}")
    public Employee getEmpById(@PathVariable("id") Integer id){
        return employeeMapper.getEmpById(id);
    }

    @GetMapping("/emp")
    public void insert(Employee employee){
        employeeMapper.insert(employee);
    }
}
