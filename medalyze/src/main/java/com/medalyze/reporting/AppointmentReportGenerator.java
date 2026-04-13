package com.medalyze.reporting;

public class AppointmentReportGenerator extends ReportTemplate {

    @Override
    protected void collectData() {
        System.out.println("[Appointment] Collecting appointments...");
    }

    @Override
    protected void validateData() {
        System.out.println("[Appointment] Validating schedule...");
    }

    @Override
    protected void formatContent() {
        System.out.println("[Appointment] Formatting report...");
    }
}