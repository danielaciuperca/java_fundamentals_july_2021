package com.daniela.exercise;

public class SmsNotification implements Notification {
    @Override
    public void sendNotification(Item item) {
        System.out.println("Notification sent via sms for item " + item);
    }
}
