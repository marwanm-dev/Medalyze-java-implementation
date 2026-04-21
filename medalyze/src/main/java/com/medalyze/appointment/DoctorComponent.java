package com.medalyze.appointment;

public class DoctorComponent extends MediatorComponent {

    public DoctorComponent(AppointmentMediator mediator) {
        super(mediator);
    }

    public void checkAvailability() {
        System.out.println("Doctor: Checking availability...");
    }
}
