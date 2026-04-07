package com.medalyze.reporting.decorator;

import com.medalyze.reporting.decorator.report.ReportComponent;

public class BasicReport implements ReportComponent {
    @Override
    public String getContent() {
        return "Medical Report";
    }

    @Override
    public double getCost() {
    return 50.0;
    }
}


