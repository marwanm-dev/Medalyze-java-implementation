package com.medalyze.dashboard;

public class AdminReport implements ReportProduct {

    @Override
    public void generateReport() {
        System.out.println("Admin generating report");
    }
}