package com.medalyze.appointment;

public class PatientComponent extends MediatorComponent {

    public PatientComponent(AppointmentMediator mediator) {
        super(mediator);
    }

    public void requestAppointment() {
        System.out.println("Patient: Requesting appointment...");
        mediator.notify(this, "requestAppointment");
    }
}
