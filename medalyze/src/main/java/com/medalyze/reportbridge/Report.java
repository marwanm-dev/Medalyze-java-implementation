package com.medalyze.reportbridge;

public abstract class Report {

    protected ReportFormat format;

    public Report(ReportFormat format) {
        this.format = format;
    }

    public abstract void generate();
}