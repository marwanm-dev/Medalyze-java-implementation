package com.medalyze.reporting;

public abstract class ReportCreator {

    public abstract Report createReport();

    public void generateReport() {
        Report report = createReport();
        report.generate();
    }
}