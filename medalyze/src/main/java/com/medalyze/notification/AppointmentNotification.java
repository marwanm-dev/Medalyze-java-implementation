package com.medalyze.notification;

import com.medalyze.model.Appointment;

public class AppointmentNotification extends Notification {

    public AppointmentNotification(NotificationSender sender) {
        super(sender);
    }

    @Override
    public void notifyUser(String recipient, String message) {
        sender.send(recipient, "[Appointment] " + message);
    }

    public void notifyAppointmentCreated(Appointment appointment) {
        String msg = "Appointment on " +
                appointment.getDate() + " at " + appointment.getTime();

        // ✅ FIX HERE
        sender.send(appointment.getPatient().getContactInfo(), msg);
    }
}