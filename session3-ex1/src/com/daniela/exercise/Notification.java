package com.daniela.exercise;

public interface Notification {
    String LIBRARY_NAME = "My library";//by default, all fields are public static final in an interface

    void sendNotification(Item item);//by default, all methods are public and abstract in an interface

}
