package com.medalyze.decorator;

public abstract class AppointmentDecorator implements AppointmentService {

    protected AppointmentService appointment;

    public AppointmentDecorator(AppointmentService appointment) {
        this.appointment = appointment;
    }

    @Override
    public String getDescription() {
        return appointment.getDescription();
    }

    @Override
    public double getCost() {
        return appointment.getCost();
    }
}