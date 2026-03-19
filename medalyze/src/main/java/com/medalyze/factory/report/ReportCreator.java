package com.medalyze.factory.report;

import com.medalyze.reports.Report;

public abstract class ReportCreator {

    public abstract Report createReport();

    public void generateReport() {
        Report report = createReport();
        report.generate();
    }
}