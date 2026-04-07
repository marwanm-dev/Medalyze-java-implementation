package com.medalyze.billing;
import com.medalyze.infrastructure.Logger;

public class InsurancePrescription implements Prescription {

    @Override
    public void handlePrescription() {
        Logger.getInstance().log("Processing prescription with insurance coverage.");
    }
}