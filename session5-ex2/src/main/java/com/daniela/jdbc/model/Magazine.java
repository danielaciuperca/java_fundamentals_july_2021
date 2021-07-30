package com.daniela.jdbc.model;

public class Magazine extends Item {
    private int publishingMonth;
    private int publishingYear;

    public Magazine(String code, String title, int publishingMonth, int publishingYear) {
        super(code, title);
        this.publishingMonth = publishingMonth;
        this.publishingYear = publishingYear;
    }

    public int getPublishingMonth() {
        return publishingMonth;
    }

    public void setPublishingMonth(int publishingMonth) {
        this.publishingMonth = publishingMonth;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public void borrow() {
        System.out.println("Borrow magazine under specific rules.");
    }

    @Override
    public String toString() {
        return super.toString() + ", " + publishingMonth + ", " + publishingYear;
    }
}
