package com.medalyze.reporting;

import com.medalyze.reporting.BillingReport;
import com.medalyze.reporting.Report;

public class BillingReportCreator extends ReportCreator {

    @Override
    public Report createReport() {
        return new BillingReport();
    }
}