package com.medalyze.dashboard;

public class DoctorDashboardFactory implements DashboardFactory {

    @Override
    public ReportProduct createReport() {
        return new DoctorReport();
    }

    @Override
    public AppointmentProduct createAppointment() {
        return new DoctorAppointment();
    }
}