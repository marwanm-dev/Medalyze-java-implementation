package com.medalyze.notification;

public class AuditLogObserver implements HospitalObserver {

    public void update(String event) {
        System.out.println("[Audit Log] Event recorded: " + event);
    }
}
