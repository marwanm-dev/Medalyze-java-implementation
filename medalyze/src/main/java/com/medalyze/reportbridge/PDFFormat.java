package com.medalyze.reportbridge;

public class PDFFormat implements ReportFormat {

    @Override
    public void export(String content) {
        System.out.println("Exporting PDF: " + content);
    }
}