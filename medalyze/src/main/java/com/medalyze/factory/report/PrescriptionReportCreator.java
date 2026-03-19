package com.medalyze.factory.report;

import com.medalyze.reports.PrescriptionReport;
import com.medalyze.reports.Report;

public class PrescriptionReportCreator extends ReportCreator {

    @Override
    public Report createReport() {
        return new PrescriptionReport();
    }
}