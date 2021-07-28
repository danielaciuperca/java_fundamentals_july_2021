package com.daniela.exercise;

/*Book is a concrete class and it inherits an abstract method from Item
  1. Book becomes abstract, and it has the abstract method borrow()
  2. Book remains a concrete class, but it has override (to offer an implementation)
    for the abstract method borrow()

 */
public /*abstract*/ class Book extends Item {
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
}
