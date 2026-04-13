package com.medalyze.reporting;

public class BillingReportGenerator extends ReportTemplate {

    @Override
    protected void collectData() {
        System.out.println("[Billing] Collecting billing data...");
    }

    @Override
    protected void validateData() {
        System.out.println("[Billing] Validating billing...");
    }

    @Override
    protected void formatContent() {
        System.out.println("[Billing] Formatting report...");
    }
}