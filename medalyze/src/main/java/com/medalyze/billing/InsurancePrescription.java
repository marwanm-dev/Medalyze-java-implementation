package com.medalyze.billing;

public class InsurancePrescription implements Prescription {

    @Override
    public void handlePrescription() {
        System.out.println("Processing prescription with insurance coverage.");
    }
}