package com.medalyze.billing;
import com.medalyze.infrastructure.Logger;

public class SelfPayPrescription implements Prescription {

    @Override
    public void handlePrescription() {
        Logger.getInstance().log("Processing prescription without insurance.");
    }
}