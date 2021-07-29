package com.daniela.exercise;

public class EmailNotification implements Notification {
    @Override
    public void sendNotification(Item item) {
        System.out.println("Notification sent via email for item " + item);
    }
}
