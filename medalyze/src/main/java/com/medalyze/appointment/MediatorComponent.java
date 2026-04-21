package com.medalyze.appointment;

public abstract class MediatorComponent {

    protected AppointmentMediator mediator;

    public MediatorComponent(AppointmentMediator mediator) {
        this.mediator = mediator;
    }
}
