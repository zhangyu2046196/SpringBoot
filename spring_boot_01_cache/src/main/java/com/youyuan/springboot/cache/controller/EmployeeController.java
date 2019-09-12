package com.youyuan.springboot.cache.controller;

import com.youyuan.springboot.cache.bean.Employee;
import com.youyuan.springboot.cache.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangyu
 * @version 1.0
 * @description 员工控制层
 * @date 2018/12/19 11:31
 */
@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/emp/{id}")
    public Employee getEmpById(@PathVariable("id") Integer id){
        return employeeService.getEmpById(id);
    }

    /**
     * 保存
     * @param employee  员 工
     */
    @GetMapping("/emp/insert")
    public void insertEmp(Employee employee){
        employeeService.insert(employee);
    }

    /**
     * 更新
     * @param employee  员 工
     */
    @GetMapping("/emp/update")
    public void update(Employee employee){
        employeeService.update(employee);
    }

    /**
     * 删除
     * @param id 主键
     * @return 返回信息
     */
    @GetMapping("/emp/delete/{id}")
    public String delete(@PathVariable("id") Integer id){
        employeeService.delete(id);
        return "success";
    }

    /**
     * 根据用户名查询
     * @param lastName 用户名 数据
     * @return 用户实体bean
     */
    @GetMapping("/emp/lastName/{lastName}")
    public Employee getEmpByLastName(@PathVariable("lastName") String lastName){
        return employeeService.getEmpByLastName(lastName);
    }
}
