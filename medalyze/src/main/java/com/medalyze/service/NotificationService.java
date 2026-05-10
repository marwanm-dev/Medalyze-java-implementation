package com.medalyze.service;

import com.medalyze.dto.AppointmentDTO;
import com.medalyze.dto.UserDTO;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public void generateNotification(
            UserDTO user,
            AppointmentDTO appointment
    ) {

        System.out.println(
                "Notification: Appointment booked for "
                        + user.getName()
                        + " on "
                        + appointment.getAppointmentDate()
                        + " at "
                        + appointment.getAppointmentTime()
        );
    }
}