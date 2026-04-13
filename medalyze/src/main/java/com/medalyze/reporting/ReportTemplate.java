package com.medalyze.reporting;

public abstract class ReportTemplate {

    public final void generateReport() {
        collectData();
        validateData();
        formatContent();
        exportReport();
    }

    protected abstract void collectData();
    protected abstract void validateData();
    protected abstract void formatContent();

    protected void exportReport() {
        System.out.println("Exporting report...");
    }
}