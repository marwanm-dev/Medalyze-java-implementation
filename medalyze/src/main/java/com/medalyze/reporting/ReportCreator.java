package com.medalyze.reporting;

import com.medalyze.reporting.Report;

public abstract class ReportCreator {

    public abstract Report createReport();

    public void generateReport() {
        Report report = createReport();
        report.generate();
    }
}