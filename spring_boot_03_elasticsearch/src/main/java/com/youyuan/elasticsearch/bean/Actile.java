package com.youyuan.elasticsearch.bean;

import io.searchbox.annotations.JestId;

import java.io.Serializable;

/**
 * @author zhangyu
 * @version 1.0
 * @description 文章
 * @date 2018/12/26 23:16
 */
public class Actile implements Serializable {
    private static final long serialVersionUID = 565373056515304912L;

    /**
     * 主键
     */
    @JestId
    private Integer id;
    /**
     * 作者
     */
    private String auth;
    /**
     * 标题
     */
    private String title;
    /**
     * 内容
     */
    private String content;

    public Actile() {
    }

    public Actile(Integer id, String auth, String title, String content) {
        this.id = id;
        this.auth = auth;
        this.title = title;
        this.content = content;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Actile{" +
                "id=" + id +
                ", auth='" + auth + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
