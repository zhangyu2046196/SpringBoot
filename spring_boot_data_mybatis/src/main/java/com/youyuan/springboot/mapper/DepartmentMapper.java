package com.youyuan.springboot.mapper;

import com.youyuan.springboot.bean.DepartMent;
import org.apache.ibatis.annotations.*;

/**
 * @author zhangyu
 * @version 1.0
 * @description 基于注解的mybatis接口编程的mapper
 * @Mapper注解表示这个类是mybatis的接口用于操作数据库
 * @date 2018/12/17 16:20
 */
//@Mapper
public interface DepartmentMapper {

    /**
     * 查询部门
     * @param id 部门id
     * @return 返回部门bean
     */
    @Select("select * from department where id=#{id}")
    public DepartMent getDepartmentById(Integer id);

    /**
     * 删除部门
     * @param id 部门id
     * @return 返回删除部门数
     */
    @Delete("delete from department where id=#{id}")
    public int delete(Integer id);

    /**
     * 增加部门
     * useGeneratedKeys 主键使用自增
     * keyProperty   主键的属性是id
     * @param departMent 部门
     * @return 返回增加的部门
     */
    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department (departmentName) values (#{departmentName})")
    public void insert(DepartMent departMent);

    /**
     * 修改部门
     * @param departMent 部门名称
     * @return 返回修改数
     */
    @Update("update department set departmentName=#{departmentName} where id=#{id}")
    public int update(DepartMent departMent);
}
