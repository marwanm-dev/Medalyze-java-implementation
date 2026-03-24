package com.medalyze;
import com.medalyze.notification.*;
import com.medalyze.flyweight.Specialization;
import com.medalyze.flyweight.SpecializationFactory;
import com.medalyze.factory.report.BillingReportCreator;
import com.medalyze.factory.report.MedicalReportCreator;
import com.medalyze.factory.report.PrescriptionReportCreator;
import com.medalyze.factory.report.ReportCreator;
import com.medalyze.singleton.DatabaseConnection;
import com.medalyze.singleton.Logger;
import com.medalyze.abstractfactory.billing.BillingFactory;
import com.medalyze.abstractfactory.billing.InsuranceBillingFactory;
import com.medalyze.abstractfactory.billing.SelfPayBillingFactory;
import com.medalyze.abstractfactory.dashboard.AdminDashboardFactory;
import com.medalyze.abstractfactory.dashboard.DashboardFactory;
import com.medalyze.abstractfactory.dashboard.DoctorDashboardFactory;
import com.medalyze.billing.BillingRecord;
import com.medalyze.billing.Prescription;
import com.medalyze.dashboard.AppointmentProduct;
import com.medalyze.dashboard.ReportProduct;
import com.medalyze.reportbridge.*;
import com.medalyze.reportbridge.Report;

/**
 * Main class to test core creational design patterns:
 * - Singleton: Logger, DatabaseConnection
 * - Factory Method: ReportCreator
 * - Abstract Factory: DashboardFactory, BillingFactory
 */
public class Main {

    public static void main(String[] args) {
        Specialization s1 = 
            SpecializationFactory.getSpecialization("Cardiology");
        
        Specialization s2 = 
            SpecializationFactory.getSpecialization("Cardiology");
        
        System.out.println(s1 == s2);

        System.out.println("=== Starting Medalyze System Test ===\n");

        // =======================
        // Test Singleton Patterns
        // =======================
        System.out.println("** Logger Singleton Test **");
        Logger logger0 = Logger.getInstance();
        Logger logger1 = Logger.getInstance();
        System.out.println("Same logger instance? " + (logger0 == logger1) + "\n");

        System.out.println("** DatabaseConnection Singleton Test **");
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        System.out.println("Same database instance? " + (db1 == db2) + "\n");

        // =========================
        // Test Factory Method Pattern
        // =========================
        System.out.println("** Factory Method Test **");
        ReportCreator creator;

        creator = new MedicalReportCreator();
        creator.generateReport();

        creator = new BillingReportCreator();
        creator.generateReport();

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

        adminReport.generateReport();
        adminAppointment.manageAppointment();
        System.out.println();

        System.out.println("** Dashboard Abstract Factory Test: Doctor Dashboard **");
        DashboardFactory doctorFactory = new DoctorDashboardFactory();

        ReportProduct doctorReport = doctorFactory.createReport();
        AppointmentProduct doctorAppointment = doctorFactory.createAppointment();

        doctorReport.generateReport();
        doctorAppointment.manageAppointment();
        System.out.println();

        // =========================
        // Test Abstract Factory Pattern: Billing
        // =========================
        System.out.println("** Billing Abstract Factory Test: Insurance Billing **");
        BillingFactory insuranceFactory = new InsuranceBillingFactory();

        BillingRecord insuranceBilling = insuranceFactory.createBillingRecord();
        Prescription insurancePrescription = insuranceFactory.createPrescription();

        insuranceBilling.processBilling();
        insurancePrescription.handlePrescription();
        System.out.println();

        System.out.println("** Billing Abstract Factory Test: Self-Pay Billing **");
        BillingFactory selfPayFactory = new SelfPayBillingFactory();

        BillingRecord selfPayBilling = selfPayFactory.createBillingRecord();
        Prescription selfPayPrescription = selfPayFactory.createPrescription();

        selfPayBilling.processBilling();
        selfPayPrescription.handlePrescription();
        System.out.println();

        System.out.println("=== Medalyze System Test Completed Successfully ===");
        
        System.out.println("\n=== Bridge Pattern Test: Notifications ===");

        // Create senders
        NotificationSender emailSender = new EmailSender();
        NotificationSender smsSender = new SMSSender();

        // Create notification (bridge)
        Notification emailNotif = new AppointmentNotification(emailSender);
        Notification smsNotif = new AppointmentNotification(smsSender);

        // Use existing patient from your system OR create one
        Patient patient = new Patient("P1", "Ali", "ali@email.com");

        // Send notifications
        emailNotif.notifyUser(patient.getContactInfo(), "Your appointment is confirmed!");
        smsNotif.notifyUser(patient.getContactInfo(), "Reminder: Appointment tomorrow!");
        
        System.out.println("\n=== Bridge Pattern Test: Reports ===");

        // Formats
        ReportFormat pdf = new PDFFormat();
        ReportFormat csv = new CSVFormat();
        ReportFormat html = new HTMLFormat();

        // Reports
        Report medicalPDF = new MedicalReport(pdf);
        Report billingCSV = new BillingReportBridge(csv);
        Report appointmentHTML = new AppointmentReportBridge(html);

        // Generate
        medicalPDF.generate();
        billingCSV.generate();
        appointmentHTML.generate();
    }
}