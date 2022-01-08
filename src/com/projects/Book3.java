package com.projects;

public class Book3 {
    private String name;
    private int publishingYear;
    private int pageCount;
    private String author;

    public Book3(String name, int ReleaseYear, int pages, String author) {
        this.name = name;
        this.publishingYear = ReleaseYear;
        this.pageCount = pages;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public String getAuthor() {
        return author;
    }

    public int getPagecount() {
        return pageCount;
    }
}
