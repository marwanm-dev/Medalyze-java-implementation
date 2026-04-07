package com.medalyze.reporting;

import com.medalyze.reporting.MedicalReport;
import com.medalyze.reporting.Report;

public class MedicalReportCreator extends ReportCreator {

    @Override
    public Report createReport() {
        return new MedicalReport();
    }
}