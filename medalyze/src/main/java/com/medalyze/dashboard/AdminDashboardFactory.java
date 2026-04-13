package com.medalyze.dashboard;

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