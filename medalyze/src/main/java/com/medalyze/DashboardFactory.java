package com.medalyze;

public interface DashboardFactory {

    ReportProduct createReport();

    AppointmentProduct createAppointment();
}