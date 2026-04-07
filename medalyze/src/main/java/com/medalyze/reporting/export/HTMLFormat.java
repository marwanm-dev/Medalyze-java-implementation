package com.medalyze.reporting.export;

public class HTMLFormat implements ReportFormat {

    @Override
    public void export(String content) {
        System.out.println("Exporting HTML: " + content);
    }
}