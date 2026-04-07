package com.medalyze.reporting.decorator;
import com.medalyze.reporting.decorator.report.ReportComponent;
public abstract class ReportDecorator implements ReportComponent {

    protected ReportComponent report;

    public ReportDecorator(ReportComponent report) {
        this.report = report;
    }

    @Override
    public String getContent() {
        return report.getContent();
    }

    @Override
    public double getCost() {
        return report.getCost();
    }
}