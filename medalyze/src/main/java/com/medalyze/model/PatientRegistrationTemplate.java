package com.medalyze.model;

public abstract class PatientRegistrationTemplate {

    public final void registerPatient() {
        gatherInformation();
        validateInformation();
        createRecord();
        assignDoctor();
        sendConfirmation();
    }

    protected abstract void gatherInformation();
    protected abstract void validateInformation();
    protected abstract void createRecord();

    protected void assignDoctor() {
        System.out.println("Assigning doctor...");
    }

    protected void sendConfirmation() {
        System.out.println("Sending confirmation...");
    }
}