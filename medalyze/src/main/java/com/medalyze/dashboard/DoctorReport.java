package com.medalyze.dashboard;

public class DoctorReport implements ReportProduct {

    @Override
    public void generateReport() {
        System.out.println("Doctor generating report");
    }
}