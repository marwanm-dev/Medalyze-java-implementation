package com.medalyze.reporting;

public class BillingReport implements Report {

    @Override
    public void generate() {
        System.out.println("Generating billing report...");
    }
}