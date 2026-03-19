package com.medalyze.reports;

public class PrescriptionReport implements Report {

    @Override
    public void generate() {
        System.out.println("Generating prescription report...");
    }
}