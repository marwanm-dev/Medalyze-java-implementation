package com.medalyze.abstractfactory.dashboard;

import com.medalyze.dashboard.AppointmentProduct;
import com.medalyze.dashboard.ReportProduct;
import com.medalyze.dashboard.AdminAppointment;
import com.medalyze.dashboard.AdminReport;

public class AdminDashboardFactory implements DashboardFactory {

    @Override
    public ReportProduct createReport() {
        return new AdminReport();
    }

    @Override
    public AppointmentProduct createAppointment() {
        return new AdminAppointment();
    }
}