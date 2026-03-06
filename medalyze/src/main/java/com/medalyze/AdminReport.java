package com.medalyze;

public class AdminReport implements ReportProduct {

    @Override
    public void generateReport() {
        System.out.println("Generating Admin Billing Report...");
    }
}