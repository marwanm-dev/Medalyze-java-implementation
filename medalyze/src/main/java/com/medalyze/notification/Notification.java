package com.medalyze.notification;

public abstract class Notification {

    protected NotificationSender sender;

    public Notification(NotificationSender sender) {
        this.sender = sender;
    }

    public abstract void notifyUser(String recipient, String message);
}