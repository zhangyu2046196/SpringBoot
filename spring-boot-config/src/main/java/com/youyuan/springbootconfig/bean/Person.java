package com.youyuan.springbootconfig.bean;

import com.sun.javafx.collections.MappingChange;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author zhangyu
 * @version 1.0
 * @description 测试配置文件的属性值和类的属性值进行绑定
 * @ConfigurationProperties 将配置文件的属性值和类的属性值绑定  prefix="person"  配置文件的层级前缀
 * Person类必须在容器中,所以使用@Component 注解
 * @date 2018/12/10 14:30
 */
@Component
//@PropertySource(value="classpath:person.properties")
@ConfigurationProperties(prefix = "person")
public class Person implements Serializable {
    private static final long serialVersionUID = -3584731983127237997L;

    private String lastName;
    private Integer age;
    private Boolean boss;
    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }
}
