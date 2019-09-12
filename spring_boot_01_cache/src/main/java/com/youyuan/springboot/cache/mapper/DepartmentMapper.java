package com.youyuan.springboot.cache.mapper;

import com.youyuan.springboot.cache.bean.Department;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * @author zhangyu
 * @version 1.0
 * @description 部门mapper
 * @date 2018/12/19 11:23
 */
public interface DepartmentMapper {

    /**
     * 查询
     * @param id 主键
     * @return 返回部门
     */
    @Select("select * from department where id=#{id}")
    public Department getDepartmentById(Integer id);

    /**
     * 更新
     * @param department 部门
     */
    @Update("update department set departmentName=#{departmentName} where id=#{id}")
    public void update(Department department);

    /**
     * 保存
     * @param department 部门
     */
    @Insert("insert into department (departmentName) values (#{departmentName})")
    public void insert(Department department);

    /**
     * 删除
     * @param id 主键
     */
    @Delete("delete from department where id=#{id}")
    public void delete(Integer id);
}
