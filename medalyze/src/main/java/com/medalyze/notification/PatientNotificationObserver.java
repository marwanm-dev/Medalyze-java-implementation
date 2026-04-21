package com.medalyze.notification;

public class PatientNotificationObserver implements HospitalObserver {

    public void update(String event) {
        System.out.println("[Patient Notification] " + event);
    }
}
