package com.medalyze.appointment;

public class AppointmentCoordinator implements AppointmentMediator {

    private DoctorComponent doctor;
    private PatientComponent patient;
    private RoomComponent room;
    private BillingComponent billing;

    public void setDoctor(DoctorComponent doctor) {
        this.doctor = doctor;
    }

    public void setPatient(PatientComponent patient) {
        this.patient = patient;
    }

    public void setRoom(RoomComponent room) {
        this.room = room;
    }

    public void setBilling(BillingComponent billing) {
        this.billing = billing;
    }

    @Override
    public void notify(MediatorComponent sender, String event) {

        if (event.equals("requestAppointment")) {
            System.out.println("Mediator: Coordinating appointment...");

            doctor.checkAvailability();
            room.reserveRoom();
            billing.processPayment();

            System.out.println("Mediator: Appointment confirmed\n");
        }
    }
}
