package com.medalyze.dashboard;

public class AppointmentPanel extends DashboardPanel {

    public AppointmentPanel(DashboardMediator mediator) {
        super(mediator);
    }

    public void refresh() {
        System.out.println("AppointmentPanel: Refreshing appointments...");
    }
}