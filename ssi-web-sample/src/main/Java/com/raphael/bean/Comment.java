package com.raphael.bean;

/**
 * 实体
 * Created by Administrator on 2015/2/14.
 */
public class Comment {
    private int id;
    private String title;
    private String content;

    public Comment(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public Comment(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
