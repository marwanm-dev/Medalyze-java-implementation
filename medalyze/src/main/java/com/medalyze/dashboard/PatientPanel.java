package com.medalyze.dashboard;

public class PatientPanel extends DashboardPanel {

    public PatientPanel(DashboardMediator mediator) {
        super(mediator);
    }

    public void updatePatient() {
        System.out.println("PatientPanel: Patient updated");
        mediator.notify(this, "patientUpdated");
    }
}