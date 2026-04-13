package com.medalyze;

import com.medalyze.reporting.*;
import com.medalyze.model.*;

public class MainD3 {

    public static void main(String[] args) {

        System.out.println("=== Deliverable 3 Test (Behavioral Patterns) ===\n");

        // =========================
        // Test Template Method Case 1: Report Generation
        // =========================
        System.out.println("=== Template Method Case 1 Test: Report Generation ===");

        ReportTemplate medicalReport = new MedicalReportGenerator();
        ReportTemplate billingReport = new BillingReportGenerator();
        ReportTemplate appointmentReport = new AppointmentReportGenerator();

        System.out.println("Generating Medical Report:");
        medicalReport.generateReport();

        System.out.println("\nGenerating Billing Report:");
        billingReport.generateReport();

        System.out.println("\nGenerating Appointment Report:");
        appointmentReport.generateReport();

        System.out.println();

        // =========================
        // Test Template Method Case 2: Patient Registration
        // =========================
        System.out.println("=== Template Method Case 2 Test: Patient Registration ===");

        PatientRegistrationTemplate regular = new RegularPatientRegistration();
        PatientRegistrationTemplate emergency = new EmergencyPatientRegistration();
        PatientRegistrationTemplate insurance = new InsurancePatientRegistration();

        System.out.println("Registering Regular Patient:");
        regular.registerPatient();

        System.out.println("\nRegistering Emergency Patient:");
        emergency.registerPatient();

        System.out.println("\nRegistering Insurance Patient:");
        insurance.registerPatient();

        System.out.println();

        System.out.println("\n=== Deliverable 3 Completed Successfully ===");
    }
}