package com.medalyze.factory.report;

import com.medalyze.reports.MedicalReport;
import com.medalyze.reports.Report;

public class MedicalReportCreator extends ReportCreator {

    @Override
    public Report createReport() {
        return new MedicalReport();
    }
}