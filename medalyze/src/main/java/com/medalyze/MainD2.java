package com.medalyze;

import com.medalyze.adapter.legacy.MedicalRecord;
import com.medalyze.adapter.legacy.LegacyMedicalRecord;
import com.medalyze.adapter.legacy.MedicalRecordAdapter;
import com.medalyze.adapter.payment.PaymentGatewayAdapter;
import com.medalyze.adapter.payment.PaymentProcessor;
import com.medalyze.decorator.AppointmentService;
import com.medalyze.decorator.BasicAppointment;
import com.medalyze.decorator.BasicReport;
import com.medalyze.decorator.EncryptedReport;
import com.medalyze.decorator.InsuranceProcessing;
import com.medalyze.decorator.OnlineConsultation;
import com.medalyze.decorator.PriorityAppointment;
import com.medalyze.decorator.SignedReport;
import com.medalyze.decorator.WatermarkedReport;
import com.medalyze.decorator.report.ReportComponent;
import com.medalyze.flyweight.Specialization;
import com.medalyze.flyweight.SpecializationFactory;
import com.medalyze.notification.AppointmentNotification;
import com.medalyze.notification.EmailSender;
import com.medalyze.notification.Notification;
import com.medalyze.notification.NotificationSender;
import com.medalyze.notification.SMSSender;
import com.medalyze.reportbridge.*;
import com.medalyze.model.Patient;

public class MainD2 {

  public static void main(String[] args) {

      System.out.println("=== Deliverable 2 Test (Structural Patterns) ===\n");

      // =========================
      // Test Flyweight Pattern
      // =========================
      System.out.println("=== Flyweight Pattern Test: Specializations ===");

      Specialization s1 = SpecializationFactory.getSpecialization("Cardiology");
      Specialization s2 = SpecializationFactory.getSpecialization("Cardiology");
      Specialization s3 = SpecializationFactory.getSpecialization("Neurology");

      System.out.println("s1 == s2 (same specialization)? " + (s1 == s2));
      System.out.println("s1 == s3 (different specialization)? " + (s1 == s3));

      System.out.println("s1 name: " + s1.getName());
      System.out.println("s2 name: " + s2.getName());
      System.out.println("s3 name: " + s3.getName());

      System.out.println("HashCodes:");
      System.out.println("s1: " + s1.hashCode());
      System.out.println("s2: " + s2.hashCode());
      System.out.println("s3: " + s3.hashCode());

      System.out.println();

      // =========================
      // Test Bridge Pattern Case 1: Notifications
      // =========================
      System.out.println("=== Bridge Pattern Case 1 Test: Notifications ===");

      NotificationSender emailSender = new EmailSender();
      NotificationSender smsSender = new SMSSender();

      Notification emailNotif = new AppointmentNotification(emailSender);
      Notification smsNotif = new AppointmentNotification(smsSender);

      Patient patient = new Patient("P1", "Ali", "ali@email.com");

      System.out.println("Sending Email Notification:");
      emailNotif.notifyUser(patient.getContactInfo(), "Your appointment is confirmed!");

      System.out.println("Sending SMS Notification:");
      smsNotif.notifyUser(patient.getContactInfo(), "Reminder: Appointment tomorrow!");

      System.out.println();

      // =========================
      // Test Bridge Pattern Case 2: Reports
      // =========================
      System.out.println("=== Bridge Pattern Case 2 Test: Reports ===");

      ReportFormat pdf = new PDFFormat();
      ReportFormat csv = new CSVFormat();
      ReportFormat html = new HTMLFormat();

      System.out.println("Generating Medical Report (PDF):");
      Report medicalPDF = new MedicalReport(pdf);
      medicalPDF.generate();

      System.out.println("Generating Billing Report (CSV):");
      Report billingCSV = new BillingReportBridge(csv);
      billingCSV.generate();

      System.out.println("Generating Appointment Report (HTML):");
      Report appointmentHTML = new AppointmentReportBridge(html);
      appointmentHTML.generate();

      System.out.println();

      // =========================
      // Test Decorator case 1: Appointment
      // =========================
      System.out.println("=== Decorator Pattern Case 1 Test: Appointment Services ===");

      AppointmentService appointment = new BasicAppointment();

      appointment = new OnlineConsultation(appointment);
      appointment = new PriorityAppointment(appointment);
      appointment = new InsuranceProcessing(appointment);

      System.out.println("Final Appointment Description:");
      System.out.println(appointment.getDescription());

      System.out.println("Final Appointment Cost: $" + appointment.getCost());
      System.out.println();

      // =========================
      // Test Decorator case 2: Reports
      // =========================
      System.out.println("=== Decorator Pattern Case 2 Test: Report Enhancements ===");

      ReportComponent report = new BasicReport();

      report = new SignedReport(report);
      report = new EncryptedReport(report);
      report = new WatermarkedReport(report);

      System.out.println("Final Report Content:");
      System.out.println(report.getContent());

      System.out.println("Final Report Cost: $" + report.getCost());
      System.out.println();

      // =========================
      // Test Adapter Pattern Case 1: Payment Gateway
      // =========================
      System.out.println("=== Adapter Pattern Case 1 Test: Payment Gateway ===");

      PaymentProcessor processor = new PaymentGatewayAdapter();
      processor.processPayment(250.0);

      System.out.println();

      // =========================
      // Test Adapter Pattern Case 2: Legacy Medical Record
      // =========================
      System.out.println("=== Adapter Pattern Case 2 Test: Legacy Medical Record ===");

      MedicalRecord record =
          new MedicalRecordAdapter(new LegacyMedicalRecord());

      System.out.println("Adapted Medical History:");
      System.out.println(record.getHistory());

      System.out.println("\n=== Deliverable 2 Completed Successfully ===");
  }
}
