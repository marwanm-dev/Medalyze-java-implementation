package com.medalyze.appointment;

public class AppointmentCoordinator implements AppointmentMediator {

    public void notify(Object sender, String event) {
        System.out.println("Handling appointment event: " + event);
    }
}