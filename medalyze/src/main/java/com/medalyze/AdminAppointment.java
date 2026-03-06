package com.medalyze;

public class AdminAppointment implements AppointmentProduct {

    @Override
    public void manageAppointment() {
        System.out.println("Admin managing appointment scheduling.");
    }
}