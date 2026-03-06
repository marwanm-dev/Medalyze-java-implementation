package com.medalyze;

public class DoctorAppointment implements AppointmentProduct {

    @Override
    public void manageAppointment() {
        System.out.println("Doctor managing patient appointment.");
    }
}