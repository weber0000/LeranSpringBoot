package com.example.training03.model;

/**
 * @author weberliu
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018/9/12 16:26
 */
public class Learn {

    private String author;

    private String title;

    private String url;


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Learn(String author, String title, String url) {
        this.author = author;
        this.title = title;
        this.url = url;
    }
}
