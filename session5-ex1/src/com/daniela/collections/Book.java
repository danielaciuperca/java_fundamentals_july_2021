package com.daniela.collections;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int publishingYear;

    public Book(String title, String author, int publishingYear) {
        this.title = title;
        this.author = author;
        this.publishingYear = publishingYear;
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

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return title + " / " + author + " / " + publishingYear;
    }

    @Override
    public int compareTo(Book o) {
        //the default sorting logic for Book instances
        return this.title.compareTo(o.title);
    }
}
