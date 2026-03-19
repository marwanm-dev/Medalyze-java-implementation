package com.medalyze.reports;

public class BillingReport implements Report {

    @Override
    public void generate() {
        System.out.println("Generating billing report...");
    }
}