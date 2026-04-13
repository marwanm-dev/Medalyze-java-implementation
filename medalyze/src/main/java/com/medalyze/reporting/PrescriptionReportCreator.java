package com.medalyze.reporting;

public class PrescriptionReportCreator extends ReportCreator {

    @Override
    public Report createReport() {
        return new PrescriptionReport();
    }
}