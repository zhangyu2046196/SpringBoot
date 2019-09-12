package com.youyuan.springboot.mapper;

import com.youyuan.springboot.bean.Employee;

/**
 * @author zhangyu
 * @version 1.0
 * @description mybatis的员工接口
 * @date 2018/12/17 17:54
 */
public interface EmployeeMapper {

    /**
     * 根据id查询员工信息
     * @param id id
     * @return 返回员工bean
     */
    public Employee getEmpById(Integer id);

    /**
     * 保存员工信息
     * @param employee 员工
     */
    public void insert(Employee employee);
}
