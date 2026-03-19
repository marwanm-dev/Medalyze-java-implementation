package com.medalyze.reportbridge;

public class AppointmentReportBridge extends Report {

    public AppointmentReportBridge(ReportFormat format) {
        super(format);
    }

    @Override
    public void generate() {
        String content = "Appointment Report Data...";
        format.export(content);
    }
}