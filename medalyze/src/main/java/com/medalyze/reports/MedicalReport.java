package com.medalyze.reports;

public class MedicalReport implements Report {

    @Override
    public void generate() {
        System.out.println("Generating medical report...");
    }
}