package com.medalyze.billing;

public interface BillingFactory {

    BillingRecord createBillingRecord();

    Prescription createPrescription();
}