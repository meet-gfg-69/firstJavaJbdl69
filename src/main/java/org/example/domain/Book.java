package org.example.domain;

import java.util.Map;

public class Book {

    private String title;
    private String author;
    private Map<String, String> index;

    public Book(String title, String author, Map<String, String> index) {
        this.title = title;
        this.author = author;
        this.index = index;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Map<String, String> getIndex() {
        return index;
    }

    public void setIndex(Map<String, String> index) {
        this.index = index;
    }
}




