package com.youyuan.springboot.cache.mapper;

import com.youyuan.springboot.cache.bean.Employee;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

/**
 * @author zhangyu
 * @version 1.0
 * @description mybatis的mapper接口
 * @date 2018/12/19 11:17
 */
public interface EmployeeMapper {

    /**
     * 根据id查询
     * @param id 主键
     * @return 返回员工信息
     */
    @Select("select * from employee where id=#{id}")
    public Employee getEmpById(Integer id);

    /**
     * 更新
     * @param employee 员工
     */
    @Update("update employee set lastName=#{lastName},email=#{email},gender=#{gender},d_id=#{dId} where id=#{id}")
    public void update(Employee employee);

    /**
     * 保存
     * @param employee 员工
     */
    @Insert("insert into employee (lastName,email,gender,d_id) values (#{lastName},#{email},#{gender},#{dId})")
    public void insert(Employee employee);

    /**
     * 删除
     * @param id 主键
     */
    @Delete("delete from employee where id=#{id}")
    public void delete(Integer id);

    /**
     * 根据用户名称查询
     * @param lastName 用户名称 数据
     * @return 返回用户实体bean
     */
    @Select("select * from employee where lastName=#{lastName}")
    public Employee getEmpByLastName(String lastName);
}
