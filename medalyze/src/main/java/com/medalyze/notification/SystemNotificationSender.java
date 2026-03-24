package com.medalyze.notification;

public class SystemNotificationSender implements NotificationSender {

    @Override
    public void send(String recipient, String message) {
        System.out.println("SYSTEM ALERT to " + recipient + ": " + message);
    }
}