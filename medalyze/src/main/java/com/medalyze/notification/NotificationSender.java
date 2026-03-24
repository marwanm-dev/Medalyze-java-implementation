package com.medalyze.notification;

public interface NotificationSender {
    void send(String recipient, String message);
}