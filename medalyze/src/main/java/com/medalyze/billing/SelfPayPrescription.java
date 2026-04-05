package com.medalyze.billing;
import com.medalyze.singleton.Logger;

public class SelfPayPrescription implements Prescription {

    @Override
    public void handlePrescription() {
        Logger.getInstance().log("Processing prescription without insurance.");
    }
}