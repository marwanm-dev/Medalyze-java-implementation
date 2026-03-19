package com.medalyze.dashboard;

public class AdminAppointment implements AppointmentProduct {

    @Override
    public void manageAppointment() {
        System.out.println("Admin managing appointment");
    }
}