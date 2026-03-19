package com.medalyze.billing;

public class SelfPayBillingRecord implements BillingRecord {

    @Override
    public void processBilling() {
        System.out.println("Processing billing as self-pay.");
    }
}