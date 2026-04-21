package com.medalyze.dashboard;

public class HospitalDashboard implements DashboardMediator {

    private PatientPanel patientPanel;
    private AppointmentPanel appointmentPanel;
    private NotificationPanel notificationPanel;
    private BillingPanel billingPanel;

    public void setPatientPanel(PatientPanel panel) {
        this.patientPanel = panel;
    }

    public void setAppointmentPanel(AppointmentPanel panel) {
        this.appointmentPanel = panel;
    }

    public void setNotificationPanel(NotificationPanel panel) {
        this.notificationPanel = panel;
    }

    public void setBillingPanel(BillingPanel panel) {
        this.billingPanel = panel;
    }

    @Override
    public void notify(DashboardPanel sender, String event) {

        if (event.equals("patientUpdated")) {
            System.out.println("Mediator: Updating dashboard panels...");

            appointmentPanel.refresh();
            notificationPanel.showNotification("Patient updated");
            billingPanel.refresh();
        }
    }
}
