package com.medalyze.model;

public class RegularPatientRegistration extends PatientRegistrationTemplate {

    @Override
    protected void gatherInformation() {
        System.out.println("[Regular] Collecting full patient info...");
    }

    @Override
    protected void validateInformation() {
        System.out.println("[Regular] Validating info...");
    }

    @Override
    protected void createRecord() {
        System.out.println("[Regular] Creating record...");
    }
}