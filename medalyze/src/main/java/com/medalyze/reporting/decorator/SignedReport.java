package com.medalyze.reporting.decorator;

import com.medalyze.reporting.decorator.report.ReportComponent;

public class SignedReport extends ReportDecorator {

    public SignedReport(ReportComponent report) {
        super(report);
    }

    @Override
    public String getContent() {
        return super.getContent() + " + Digital Signature";
    }

    @Override
    public double getCost() {
        return super.getCost() + 10.0;
    }
}