package com.medalyze.reporting;

public class MedicalReportCreator extends ReportCreator {

    @Override
    public Report createReport() {
        return new MedicalReport();
    }
}