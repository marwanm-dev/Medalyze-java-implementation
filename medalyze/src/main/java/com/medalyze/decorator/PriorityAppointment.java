package com.medalyze.decorator;


  public class PriorityAppointment extends AppointmentDecorator {

    public PriorityAppointment(AppointmentService appointment) {
        super(appointment);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Priority Booking";
    }

    @Override
    public double getCost() {
        return super.getCost() + 50.0;
    }
}

