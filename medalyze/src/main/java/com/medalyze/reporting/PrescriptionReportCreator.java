package com.medalyze.reporting;

import com.medalyze.reporting.PrescriptionReport;
import com.medalyze.reporting.Report;

public class PrescriptionReportCreator extends ReportCreator {

    @Override
    public Report createReport() {
        return new PrescriptionReport();
    }
}