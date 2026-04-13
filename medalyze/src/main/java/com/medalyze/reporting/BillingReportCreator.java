package com.medalyze.reporting;

public class BillingReportCreator extends ReportCreator {

    @Override
    public Report createReport() {
        return new BillingReport();
    }
}