package com.medalyze.appointment;

public class Doctor {
    private AppointmentMediator mediator;

    public Doctor(AppointmentMediator mediator) {
        this.mediator = mediator;
    }

    public void requestAppointment() {
        mediator.notify(this, "Doctor available");
    }
}