package com.medalyze.factory.report;

import com.medalyze.reports.BillingReport;
import com.medalyze.reports.Report;

public class BillingReportCreator extends ReportCreator {

    @Override
    public Report createReport() {
        return new BillingReport();
    }
}