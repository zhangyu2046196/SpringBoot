package com.youyuan.springboot.bean;

import java.io.Serializable;

/**
 * @author zhangyu
 * @version 1.0
 * @description 员工bean
 * @date 2018/12/17 15:34
 */
public class Employee implements Serializable {
    private static final long serialVersionUID = -8145421206120274024L;
    /**
     * 主键
     */
    private Integer id;
    /**
     * 名字
     */
    private String lastName;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 性别
     */
    private Integer gender;
    /**
     * 部门
     */
    private Integer dId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", dId=" + dId +
                '}';
    }
}
