package com.medalyze.abstractfactory.dashboard;

import com.medalyze.dashboard.AppointmentProduct;
import com.medalyze.dashboard.ReportProduct;
import com.medalyze.dashboard.DoctorAppointment;
import com.medalyze.dashboard.DoctorReport;

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