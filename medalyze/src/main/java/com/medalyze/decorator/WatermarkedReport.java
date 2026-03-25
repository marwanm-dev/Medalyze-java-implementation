package com.medalyze.decorator;

import com.medalyze.decorator.report.ReportComponent;

public class WatermarkedReport extends ReportDecorator {

    public WatermarkedReport(ReportComponent report) {
        super(report);
    }

    @Override
    public String getContent() {
        return super.getContent() + " + Watermark";
    }

    @Override
    public double getCost() {
        return super.getCost() + 5.0;
    }
}
