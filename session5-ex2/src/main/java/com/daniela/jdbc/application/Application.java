package com.daniela.jdbc.application;

import com.daniela.jdbc.model.*;
import com.daniela.jdbc.repository.*;

public class Application {
    public static void main(String[] args) {
        Book book = new Book("25698",
                "One hundred years of solitude",
                "Gabriel Garcia Marquez");
        BookRepository bookRepository = new BookRepository();
        bookRepository.addBook(book);
    }
}
