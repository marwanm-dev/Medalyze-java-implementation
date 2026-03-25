package com.medalyze.decorator;
  public class BasicAppointment implements AppointmentService {

    @Override
    public String getDescription() {
        return "Basic Appointment";
    }

    @Override
    public double getCost() {
        return 100.0;
    }
}
