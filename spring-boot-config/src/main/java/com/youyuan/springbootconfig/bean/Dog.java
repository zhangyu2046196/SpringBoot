package com.youyuan.springbootconfig.bean;

import java.io.Serializable;

/**
 * @author zhangyu
 * @version 1.0
 * @description
 * @date 2018/12/10 14:32
 */
public class Dog implements Serializable {
    private static final long serialVersionUID = 1653719244196817578L;

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
