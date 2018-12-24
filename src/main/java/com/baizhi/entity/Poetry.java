package com.baizhi.entity;

import java.io.Serializable;

public class Poetry implements Serializable {

    private Integer id;

    private String title;

    private String name;
    private String content;

    private Poet poet;

    public Poetry() {
    }

    public Poetry(Integer id, String title, String name, String content, Poet poet) {
        this.id = id;
        this.title = title;
        this.name = name;
        this.content = content;
        this.poet = poet;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Poet getPoet() {
        return poet;
    }

    public void setPoet(Poet poet) {
        this.poet = poet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Poetry{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", poet=" + poet +
                '}';
    }
}



