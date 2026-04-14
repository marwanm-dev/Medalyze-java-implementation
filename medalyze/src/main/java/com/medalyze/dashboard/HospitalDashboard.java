package com.medalyze.dashboard;

public class HospitalDashboard implements DashboardMediator {

    public void notify(String event) {
        System.out.println("Dashboard event: " + event);
    }
}