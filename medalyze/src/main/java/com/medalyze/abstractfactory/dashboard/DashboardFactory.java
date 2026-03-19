package com.medalyze.abstractfactory.dashboard;

import com.medalyze.dashboard.AppointmentProduct;
import com.medalyze.dashboard.ReportProduct;

public interface DashboardFactory {

    ReportProduct createReport();

    AppointmentProduct createAppointment();
}