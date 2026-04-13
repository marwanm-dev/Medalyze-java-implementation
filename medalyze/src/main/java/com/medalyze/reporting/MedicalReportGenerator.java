package com.medalyze.reporting;

public class MedicalReportGenerator extends ReportTemplate {

    @Override
    protected void collectData() {
        System.out.println("[Medical] Collecting patient data...");
    }

    @Override
    protected void validateData() {
        System.out.println("[Medical] Validating data...");
    }

    @Override
    protected void formatContent() {
        System.out.println("[Medical] Formatting report...");
    }

    @Override
    protected void exportReport() {
        System.out.println("[Medical] Exporting as PDF...");
    }
}