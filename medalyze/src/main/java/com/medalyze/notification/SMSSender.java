package com.medalyze.notification;

public class SMSSender implements NotificationSender {

    @Override
    public void send(String recipient, String message) {
        System.out.println("SMS to " + recipient + ": " + message);
    }
}