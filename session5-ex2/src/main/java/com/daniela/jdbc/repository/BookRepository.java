package com.daniela.jdbc.repository;

import com.daniela.jdbc.model.*;

import java.sql.*;

public class BookRepository {
    private Connection connection;

    public BookRepository() {
        String url = "jdbc:mysql://database-1.c27zk9w2brnz.eu-west-1.rds.amazonaws.com:3306/library";
        String username = "admin";
        String password = "12345678";
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void addBook(Book book) {
        String sql = "insert into books values (null, ?, ?, ?)";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, book.getCode());
            statement.setString(2, book.getTitle());
            statement.setString(3, book.getAuthor());
            statement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
