package com.medalyze.billing;

public class SelfPayBillingFactory implements BillingFactory {

    @Override
    public BillingRecord createBillingRecord() {
        return new SelfPayBillingRecord();
    }

    @Override
    public Prescription createPrescription() {
        return new SelfPayPrescription();
    }
}