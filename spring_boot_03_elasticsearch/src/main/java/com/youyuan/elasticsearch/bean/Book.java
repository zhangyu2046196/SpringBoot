package com.youyuan.elasticsearch.bean;

import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

/**
 * @author zhangyu
 * @version 1.0
 * @description 书
 * @date 2018/12/27 11:07
 *
 * @Document标记文档，指定es的index和type
 *
 */
@Document(indexName = "youyuan",type = "book")
public class Book implements Serializable {
    private static final long serialVersionUID = 358741934642804L;
    /**
     * 主键
     */
    private Integer id;
    /**
     * 作者
     */
    private String author;
    /**
     * 书名
     */
    private String bookName;

    public Book(Integer id, String author, String bookName) {
        this.id = id;
        this.author = author;
        this.bookName = bookName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
