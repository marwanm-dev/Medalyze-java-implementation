package com.medalyze.billing;

public class SelfPayPrescription implements Prescription {

    @Override
    public void handlePrescription() {
        System.out.println("Processing prescription without insurance.");
    }
}