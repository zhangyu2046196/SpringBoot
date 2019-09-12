package com.youyuan.springboot.amqp.bean;

import java.io.Serializable;

/**
 * @author zhangyu
 * @version 1.0
 * @description 测试发送消息为实体bean
 * @date 2018/12/21 21:51
 */
public class Book implements Serializable {
    private static final long serialVersionUID = 1211845690030869610L;
    private String name;
    private String author;

    public Book() {
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
