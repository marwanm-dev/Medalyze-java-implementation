package com.medalyze.appointment;

public class BillingComponent extends MediatorComponent {

    public BillingComponent(AppointmentMediator mediator) {
        super(mediator);
    }

    public void processPayment() {
        System.out.println("Billing: Processing payment...");
    }
}
