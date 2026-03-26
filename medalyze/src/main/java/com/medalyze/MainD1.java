package com.medalyze;

import com.medalyze.singleton.*;
import com.medalyze.factory.report.*;
import com.medalyze.abstractfactory.billing.*;
import com.medalyze.abstractfactory.dashboard.*;
import com.medalyze.dashboard.*;
import com.medalyze.billing.*;

public class MainD1 {

  public static void main(String[] args) {

      System.out.println("=== Deliverable 1 Test (Creational Patterns) ===\n");

      // =========================
      // Test Singleton Pattern: Logger
      // =========================
      System.out.println("** Logger Singleton Test **");
      Logger logger0 = Logger.getInstance();
      Logger logger1 = Logger.getInstance();

      System.out.println("Same logger instance? " + (logger0 == logger1));
      System.out.println("Logger hashcodes: " + logger0.hashCode() + " , " + logger1.hashCode());
      System.out.println();

      // =========================
      // Test Singleton Pattern: DatabaseConnection
      // =========================
      System.out.println("** DatabaseConnection Singleton Test **");
      DatabaseConnection db1 = DatabaseConnection.getInstance();
      DatabaseConnection db2 = DatabaseConnection.getInstance();

      System.out.println("Same database instance? " + (db1 == db2));
      System.out.println("DB hashcodes: " + db1.hashCode() + " , " + db2.hashCode());
      System.out.println();

      // =========================
      // Test Factory Method Pattern
      // =========================
      System.out.println("** Factory Method Test **");

      ReportCreator creator;

      System.out.println("-> Medical Report:");
      creator = new MedicalReportCreator();
      creator.generateReport();

      System.out.println("-> Billing Report:");
      creator = new BillingReportCreator();
      creator.generateReport();

      System.out.println("-> Prescription Report:");
      creator = new PrescriptionReportCreator();
      creator.generateReport();

      System.out.println();

      // =========================
      // Test Abstract Factory Pattern: Dashboards
      // =========================
      System.out.println("** Dashboard Abstract Factory Test: Admin Dashboard **");

      DashboardFactory adminFactory = new AdminDashboardFactory();
      ReportProduct adminReport = adminFactory.createReport();
      AppointmentProduct adminAppointment = adminFactory.createAppointment();

      System.out.println("Admin Report:");
      adminReport.generateReport();

      System.out.println("Admin Appointment:");
      adminAppointment.manageAppointment();

      System.out.println();

      System.out.println("** Dashboard Abstract Factory Test: Doctor Dashboard **");

      DashboardFactory doctorFactory = new DoctorDashboardFactory();
      ReportProduct doctorReport = doctorFactory.createReport();
      AppointmentProduct doctorAppointment = doctorFactory.createAppointment();

      System.out.println("Doctor Report:");
      doctorReport.generateReport();

      System.out.println("Doctor Appointment:");
      doctorAppointment.manageAppointment();

      System.out.println();

      // =========================
      // Test Abstract Factory Pattern: Billing
      // =========================
      System.out.println("** Billing Abstract Factory Test: Insurance Billing **");

      BillingFactory insuranceFactory = new InsuranceBillingFactory();
      BillingRecord insuranceBilling = insuranceFactory.createBillingRecord();
      Prescription insurancePrescription = insuranceFactory.createPrescription();

      System.out.println("Insurance Billing:");
      insuranceBilling.processBilling();

      System.out.println("Insurance Prescription:");
      insurancePrescription.handlePrescription();

      System.out.println();

      System.out.println("** Billing Abstract Factory Test: Self-Pay Billing **");

      BillingFactory selfPayFactory = new SelfPayBillingFactory();
      BillingRecord selfPayBilling = selfPayFactory.createBillingRecord();
      Prescription selfPayPrescription = selfPayFactory.createPrescription();

      System.out.println("Self-Pay Billing:");
      selfPayBilling.processBilling();

      System.out.println("Self-Pay Prescription:");
      selfPayPrescription.handlePrescription();

      System.out.println();

      System.out.println("=== Deliverable 1 Completed Successfully ===");
  }
}
