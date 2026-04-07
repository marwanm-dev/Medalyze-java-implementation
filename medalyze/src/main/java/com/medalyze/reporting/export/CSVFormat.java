package com.medalyze.reporting.export;

public class CSVFormat implements ReportFormat {

    @Override
    public void export(String content) {
        System.out.println("Exporting CSV: " + content);
    }
}