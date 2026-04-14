package com.medalyze.dashboard;

public class PatientPanel {
    private DashboardMediator mediator;

    public PatientPanel(DashboardMediator mediator) {
        this.mediator = mediator;
    }

    public void update() {
        mediator.notify("Patient updated");
    }
}