package com.medalyze.decorator;

import com.medalyze.decorator.report.ReportComponent;

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


