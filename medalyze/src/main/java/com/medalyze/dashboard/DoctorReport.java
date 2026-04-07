package com.medalyze.dashboard;
import com.medalyze.infrastructure.Logger;

public class DoctorReport implements ReportProduct {

    @Override
    public void generateReport() {
        Logger.getInstance().log("Doctor generating report");
    }
}