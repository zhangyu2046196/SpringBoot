package com.youyuan.springboot.bean;

import java.io.Serializable;

/**
 * @author zhangyu
 * @version 1.0
 * @description 部门bean
 * @date 2018/12/17 15:32
 */
public class DepartMent implements Serializable {
    private static final long serialVersionUID = -4412497656553951747L;

    /**
     * 主键
     */
    private Integer id;
    /**
     * 部门名称
     */
    private String departmentName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "DepartMent{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
