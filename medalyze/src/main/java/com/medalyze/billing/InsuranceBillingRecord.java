package com.medalyze.billing;
import com.medalyze.singleton.Logger;
        
public class InsuranceBillingRecord implements BillingRecord {

    @Override
    public void processBilling() {
        Logger.getInstance().log("Processing billing through insurance provider");
    }
}