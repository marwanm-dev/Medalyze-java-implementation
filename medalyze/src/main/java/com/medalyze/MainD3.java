package com.medalyze;

import com.medalyze.appointment.*;
import com.medalyze.dashboard.*;

public class MainD3 {
    public static void main(String[] args) {

        AppointmentMediator mediator = new AppointmentCoordinator();

        Doctor doctor = new Doctor(mediator);
        Patient patient = new Patient(mediator);

        patient.bookAppointment();
        doctor.requestAppointment();

        HospitalDashboard dashboard = new HospitalDashboard();

        PatientPanel panel = new PatientPanel(dashboard);
          
        panel.update();
    }
}