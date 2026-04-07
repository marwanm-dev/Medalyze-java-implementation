package com.medalyze.reporting.export;

public class PDFFormat implements ReportFormat {

    @Override
    public void export(String content) {
        System.out.println("Exporting PDF: " + content);
    }
}