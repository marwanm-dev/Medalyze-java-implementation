package com.medalyze.billing;

public class InsuranceBillingRecord implements BillingRecord {

    @Override
    public void processBilling() {
        System.out.println("Processing billing through insurance provider.");
    }
}