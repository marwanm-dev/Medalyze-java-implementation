package com.medalyze.reportbridge;

public class MedicalReport extends Report {

    public MedicalReport(ReportFormat format) {
        super(format);
    }

    @Override
    public void generate() {
        String content = "Medical Report Data...";
        format.export(content);
    }
}