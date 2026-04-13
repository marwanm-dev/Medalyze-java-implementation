package com.medalyze.model;

public class InsurancePatientRegistration extends PatientRegistrationTemplate {

    @Override
    protected void gatherInformation() {
        System.out.println("[Insurance] Collecting insurance details...");
    }

    @Override
    protected void validateInformation() {
        System.out.println("[Insurance] Validating coverage...");
    }

    @Override
    protected void createRecord() {
        System.out.println("[Insurance] Creating insured record...");
    }
}