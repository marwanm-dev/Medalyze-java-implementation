package com.medalyze.abstractfactory.billing;

import com.medalyze.billing.BillingRecord;
import com.medalyze.billing.Prescription;

public interface BillingFactory {

    BillingRecord createBillingRecord();

    Prescription createPrescription();
}