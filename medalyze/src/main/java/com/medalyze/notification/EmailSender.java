package com.medalyze.notification;

public class EmailSender implements NotificationSender {

    @Override
    public void send(String recipient, String message) {
        System.out.println("EMAIL to " + recipient + ": " + message);
    }
}