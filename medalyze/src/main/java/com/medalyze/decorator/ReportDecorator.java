package com.medalyze.decorator;
import com.medalyze.decorator.report.ReportComponent;
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