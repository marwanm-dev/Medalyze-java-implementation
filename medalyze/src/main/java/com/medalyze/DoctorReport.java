package com.medalyze;

public class DoctorReport implements ReportProduct {

    @Override
    public void generateReport() {
        System.out.println("Generating Doctor Medical Report...");
    }
}