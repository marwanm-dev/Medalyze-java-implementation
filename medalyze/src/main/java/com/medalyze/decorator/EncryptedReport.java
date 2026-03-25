package com.medalyze.decorator;

import com.medalyze.decorator.report.ReportComponent;

public class EncryptedReport extends ReportDecorator {

    public EncryptedReport(ReportComponent report) {
        super(report);
    }

    @Override
    public String getContent() {
        return super.getContent() + " + Encryption";
    }

    @Override
    public double getCost() {
        return super.getCost() + 15.0;
    }
}
