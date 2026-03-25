package com.medalyze.decorator;

public class OnlineConsultation extends AppointmentDecorator {

    public OnlineConsultation(AppointmentService appointment) {
        super(appointment);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Online Consultation";
    }

    @Override
    public double getCost() {
        return super.getCost() + 30.0;
    }
}