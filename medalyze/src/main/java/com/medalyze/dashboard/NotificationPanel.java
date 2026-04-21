package com.medalyze.dashboard;

public class NotificationPanel extends DashboardPanel {

    public NotificationPanel(DashboardMediator mediator) {
        super(mediator);
    }

    public void showNotification(String message) {
        System.out.println("NotificationPanel: " + message);
    }
}