package com.daniela.jdbc.model;

public abstract class Item {
    private String code;
    private String title;

    public Item(String code, String title) {
        this.code = code;
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public abstract void borrow();

    @Override
    public String toString() {
        return code + ", " + title;
    }
}
