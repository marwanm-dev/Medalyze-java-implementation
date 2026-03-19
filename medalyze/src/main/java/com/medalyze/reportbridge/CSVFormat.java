package com.medalyze.reportbridge;

public class CSVFormat implements ReportFormat {

    @Override
    public void export(String content) {
        System.out.println("Exporting CSV: " + content);
    }
}