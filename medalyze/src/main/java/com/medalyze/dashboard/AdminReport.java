package com.medalyze.dashboard;
import com.medalyze.singleton.Logger;

public class AdminReport implements ReportProduct {

    @Override
    public void generateReport() {
        Logger.getInstance().log("Admin generating report");
    }
}