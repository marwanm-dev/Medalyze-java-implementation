package com.medalyze.service;

import com.medalyze.dto.AppointmentDTO;
import com.medalyze.dto.UserDTO;
import org.springframework.stereotype.Service;

@Service
public class AppointmentWorkflowService {

    private final UserApiService userService;
    private final AppointmentApiService appointmentService;
    private final DoctorAvailabilityService doctorAvailabilityService;
    private final NotificationService notificationService;

    public AppointmentWorkflowService(
            UserApiService userService,
            AppointmentApiService appointmentService,
            DoctorAvailabilityService doctorAvailabilityService,
            NotificationService notificationService
    ) {
        this.userService = userService;
        this.appointmentService = appointmentService;
        this.doctorAvailabilityService = doctorAvailabilityService;
        this.notificationService = notificationService;
    }

    public AppointmentDTO bookAppointmentWorkflow(
            AppointmentDTO appointmentRequest
    ) {

        // Step 1: Validate patient
        UserDTO patient =
                userService.getUserById(
                        appointmentRequest.getPatientId()
                );

        if (patient == null) {
        	throw new IllegalArgumentException("Patient not found");
        }

        // Step 2: Check doctor availability
        boolean available =
                doctorAvailabilityService.isDoctorAvailable(
                        appointmentRequest.getDoctorId(),
                        appointmentRequest.getAppointmentDate(),
                        appointmentRequest.getAppointmentTime()
                );

        if (!available) {
        	throw new IllegalArgumentException("Doctor not available");
        }

        // Step 3: Create appointment
        appointmentRequest.setStatus("Confirmed");

        AppointmentDTO createdAppointment =
                appointmentService.createAppointment(
                        appointmentRequest
                );

        // Step 4: Generate notification/log
        notificationService.generateNotification(
                patient,
                createdAppointment
        );

        return createdAppointment;
    }
}