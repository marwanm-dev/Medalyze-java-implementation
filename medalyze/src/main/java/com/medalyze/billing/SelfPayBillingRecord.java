package com.medalyze.billing;
import com.medalyze.infrastructure.Logger;

public class SelfPayBillingRecord implements BillingRecord {

    @Override
    public void processBilling() {
        Logger.getInstance().log("Processing billing as self-pay.");
    }
}