package com.medalyze.reporting;

public class MedicalReport implements Report {

    @Override
    public void generate() {
        System.out.println("Generating medical report...");
    }
}