package com.medalyze.dashboard;

public interface DashboardFactory {

    ReportProduct createReport();

    AppointmentProduct createAppointment();
}