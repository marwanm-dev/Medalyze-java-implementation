package com.medalyze.dashboard;
import com.medalyze.infrastructure.Logger;

public class AdminReport implements ReportProduct {

    @Override
    public void generateReport() {
        Logger.getInstance().log("Admin generating report");
    }
}