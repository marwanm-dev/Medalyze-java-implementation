package com.medalyze.dashboard;

public class DoctorAppointment implements AppointmentProduct {

    @Override
    public void manageAppointment() {
        System.out.println("Doctor managing appointment");
    }
}