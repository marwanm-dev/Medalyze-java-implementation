package com.medalyze.abstractfactory.billing;

import com.medalyze.billing.BillingRecord;
import com.medalyze.billing.Prescription;
import com.medalyze.billing.SelfPayBillingRecord;
import com.medalyze.billing.SelfPayPrescription;

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