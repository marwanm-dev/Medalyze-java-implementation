package com.medalyze.dashboard;
import com.medalyze.singleton.Logger;

public class DoctorReport implements ReportProduct {

    @Override
    public void generateReport() {
        Logger.getInstance().log("Doctor generating report");
    }
}