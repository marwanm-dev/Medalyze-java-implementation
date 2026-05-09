package com.medalyze;

import com.medalyze.appointment.*;
import com.medalyze.dashboard.*;
import com.medalyze.model.EmergencyPatientRegistration;
import com.medalyze.model.InsurancePatientRegistration;
import com.medalyze.model.MedicalHistoryIterator;
import com.medalyze.model.PatientMedicalHistory;
import com.medalyze.model.PatientRegistrationTemplate;
import com.medalyze.model.RegularPatientRegistration;
import com.medalyze.reporting.AppointmentReportGenerator;
import com.medalyze.reporting.BillingReportGenerator;
import com.medalyze.reporting.MedicalReportGenerator;
import com.medalyze.reporting.ReportTemplate;


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

        // =========================
        // Test Mediator Case 1: Appointment Scheduling
        // =========================
        System.out.println("=== Mediator Case 1 Test: Appointment Scheduling ===");

        AppointmentCoordinator mediator = new AppointmentCoordinator();

        DoctorComponent doctor = new DoctorComponent(mediator);
        PatientComponent patientComp = new PatientComponent(mediator);
        RoomComponent room = new RoomComponent(mediator);
        BillingComponent billing = new BillingComponent(mediator);

        // Set components inside mediator
        mediator.setDoctor(doctor);
        mediator.setPatient(patientComp);
        mediator.setRoom(room);
        mediator.setBilling(billing);

        // Trigger interaction
        System.out.println("Patient initiates appointment:");
        patientComp.requestAppointment();

        System.out.println();

        // =========================
        // Test Mediator Case 2: Dashboard Coordination
        // =========================
        System.out.println("=== Mediator Case 2 Test: Dashboard Coordination ===");

        HospitalDashboard dashboard = new HospitalDashboard();

        PatientPanel patientPanel = new PatientPanel(dashboard);
        AppointmentPanel appointmentPanel = new AppointmentPanel(dashboard);
        NotificationPanel notificationPanel = new NotificationPanel(dashboard);
        BillingPanel billingPanel = new BillingPanel(dashboard);

        // Register panels in mediator
        dashboard.setPatientPanel(patientPanel);
        dashboard.setAppointmentPanel(appointmentPanel);
        dashboard.setNotificationPanel(notificationPanel);
        dashboard.setBillingPanel(billingPanel);

        // Trigger event
        System.out.println("Updating patient through PatientPanel:");
        patientPanel.updatePatient();

        System.out.println();

        // =========================
        // Test Strategy Case 1: Payment Processing
        // =========================
        System.out.println("=== Strategy Case 1 Test: Payment Processing ===");

        com.medalyze.payment.BillingService billingService = new com.medalyze.payment.BillingService();

        // Cash Payment
        billingService.setStrategy(new com.medalyze.payment.CashPaymentStrategy());
        System.out.println("Processing Cash Payment:");
        billingService.processPayment(100.0);

        // Credit Card Payment
        billingService.setStrategy(new com.medalyze.payment.CreditCardPaymentStrategy());
        System.out.println("\nProcessing Credit Card Payment:");
        billingService.processPayment(250.5);

        // Insurance Payment
        billingService.setStrategy(new com.medalyze.payment.InsurancePaymentStrategy());
        System.out.println("\nProcessing Insurance Payment:");
        billingService.processPayment(500.0);

        System.out.println();

        // =========================
        // Test Strategy Case 2: Patient Search
        // =========================
        System.out.println("=== Strategy Case 2 Test: Patient Search ===");

        java.util.List<String> data = java.util.Arrays.asList(
                "John Doe - Doctor:Smith - Date:2026-04-10",
                "Jane Roe - Doctor:Ali - Date:2026-04-11",
                "Mark Moe - Doctor:Smith - Date:2026-04-12"
        );

        com.medalyze.model.PatientSearchService searchService =
                new com.medalyze.model.PatientSearchService();

        // Search by Name
        searchService.setStrategy(new com.medalyze.model.SearchByNameStrategy());
        System.out.println("Search by Name (John):");
        System.out.println(searchService.search(data, "John"));

        // Search by Doctor
        searchService.setStrategy(new com.medalyze.model.SearchByDoctorStrategy());
        System.out.println("\nSearch by Doctor (Smith):");
        System.out.println(searchService.search(data, "Smith"));

        // Search by Date
        searchService.setStrategy(new com.medalyze.model.SearchByDateStrategy());
        System.out.println("\nSearch by Date (2026-04-11):");
        System.out.println(searchService.search(data, "2026-04-11"));

        System.out.println();

        // =========================
        // Test Observer Case: Hospital Event System
        // =========================
        System.out.println("=== Observer Case Test: Hospital Event System ===");

        // Get singleton instance (Publisher)
        com.medalyze.notification.HospitalEventBus eventBus =
                com.medalyze.notification.HospitalEventBus.getInstance();

        // Create observers (Subscribers)
        com.medalyze.notification.HospitalObserver patientObserver =
                new com.medalyze.notification.PatientNotificationObserver();

        com.medalyze.notification.HospitalObserver billingObserver =
                new com.medalyze.notification.BillingObserver();

        com.medalyze.notification.HospitalObserver auditObserver =
                new com.medalyze.notification.AuditLogObserver();

        // Subscribe observers
        eventBus.subscribe(patientObserver);
        eventBus.subscribe(billingObserver);
        eventBus.subscribe(auditObserver);

        // Trigger events
        System.out.println("\nTriggering Event: Patient Admitted");
        eventBus.notifyObservers("Patient admitted to hospital");

        System.out.println("\nTriggering Event: Payment Completed");
        eventBus.notifyObservers("Patient payment completed");

        // Unsubscribe one observer
        System.out.println("\nUnsubscribing Billing Observer...");
        eventBus.unsubscribe(billingObserver);

        // Trigger another event
        System.out.println("\nTriggering Event: Patient Discharged");
        eventBus.notifyObservers("Patient discharged");

        System.out.println();

        // =========================
        // Test Iterator Case 1: Patient Medical History
        // =========================
        System.out.println("=== Iterator Case 1 Test: Patient Medical History ===");

        PatientMedicalHistory history = new PatientMedicalHistory();
        history.addRecord("2026-01-10 - Diagnosed with hypertension");
        history.addRecord("2026-02-15 - Started diabetes treatment");
        history.addRecord("2026-03-20 - Follow-up visit completed");

        MedicalHistoryIterator iterator = history.createIterator();

        System.out.println("Patient Medical History Records:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();
        
        System.out.println("\n=== Deliverable 3 Completed Successfully ===");
    }
}