package com.medalyze.notification;

public class BillingObserver implements HospitalObserver {

    public void update(String event) {
        System.out.println("[Billing System] Processing event: " + event);
    }
}
