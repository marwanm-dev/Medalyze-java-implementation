package com.medalyze.abstractfactory.billing;

import com.medalyze.billing.BillingRecord;
import com.medalyze.billing.InsuranceBillingRecord;
import com.medalyze.billing.InsurancePrescription;
import com.medalyze.billing.Prescription;

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