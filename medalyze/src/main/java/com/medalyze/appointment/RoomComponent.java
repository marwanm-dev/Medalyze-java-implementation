package com.medalyze.appointment;

public class RoomComponent extends MediatorComponent {

    public RoomComponent(AppointmentMediator mediator) {
        super(mediator);
    }

    public void reserveRoom() {
        System.out.println("Room: Reserving room...");
    }
}
