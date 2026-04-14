package com.medalyze.appointment;

public class Patient {
    private AppointmentMediator mediator;

    public Patient(AppointmentMediator mediator) {
        this.mediator = mediator;
    }

    public void bookAppointment() {
        mediator.notify(this, "Patient booking");
    }
}