package com.medalyze.billing;

public class InsuranceBillingFactory implements BillingFactory {

    @Override
    public BillingRecord createBillingRecord() {
        return new InsuranceBillingRecord();
    }

    @Override
    public Prescription createPrescription() {
        return new InsurancePrescription();
    }
}