package com.example.y.mvp;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 

/**
 * Entity mapped to table "JOKE_PIC_INFO".
 */
public class JokePicInfo {

    private Integer tag;
    private String id;
    private String ct;
    private String title;
    private String type;
    private String img;

    public JokePicInfo() {
    }

    public JokePicInfo(Integer tag) {
        this.tag = tag;
    }

    public JokePicInfo(Integer tag, String id, String ct, String title, String type, String img) {
        this.tag = tag;
        this.id = id;
        this.ct = ct;
        this.title = title;
        this.type = type;
        this.img = img;
    }

    public Integer getTag() {
        return tag;
    }

    public void setTag(Integer tag) {
        this.tag = tag;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCt() {
        return ct;
    }

    public void setCt(String ct) {
        this.ct = ct;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

}
