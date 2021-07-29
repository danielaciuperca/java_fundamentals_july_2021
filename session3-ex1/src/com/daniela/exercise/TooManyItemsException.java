package com.daniela.exercise;

public class TooManyItemsException extends Exception {

    public TooManyItemsException() {
        super("The library items list is full. You cannot add another item.");
    }
}
