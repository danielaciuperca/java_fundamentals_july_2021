package com.daniela.jdbc.model;

public class Book extends Item {
    private String author;

    public Book(String code, String title,
                String author) {
        super(code, title);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void borrow() {
        System.out.println("Borrow book under the specific rules.");
    }

    @Override
    public String toString() {
        return super.toString() + ", " + author;
    }
}
