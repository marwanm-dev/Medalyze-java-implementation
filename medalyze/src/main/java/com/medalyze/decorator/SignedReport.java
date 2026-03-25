package com.medalyze.decorator;

import com.medalyze.decorator.report.ReportComponent;

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