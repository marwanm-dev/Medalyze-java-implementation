package com.medalyze.reportbridge;

public class BillingReportBridge extends Report {

    public BillingReportBridge(ReportFormat format) {
        super(format);
    }

    @Override
    public void generate() {
        String content = "Billing Report Data...";
        format.export(content);
    }
}