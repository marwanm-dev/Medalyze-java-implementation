package com.medalyze.model;

public class EmergencyPatientRegistration extends PatientRegistrationTemplate {

    @Override
    protected void gatherInformation() {
        System.out.println("[Emergency] Minimal info...");
    }

    @Override
    protected void validateInformation() {
        System.out.println("[Emergency] Skipping validation...");
    }

    @Override
    protected void createRecord() {
        System.out.println("[Emergency] Creating emergency record...");
    }

    @Override
    protected void assignDoctor() {
        System.out.println("[Emergency] Assigning doctor immediately...");
    }
}