package com.medalyze.controller;

import com.medalyze.dto.AppointmentDTO;
import com.medalyze.service.AppointmentApiService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {

    private final AppointmentApiService appointmentService;

    public AppointmentController(AppointmentApiService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @GetMapping
    public List<AppointmentDTO> getAllAppointments() {
        return appointmentService.getAllAppointments();
    }

    @GetMapping("/{id}")
    public AppointmentDTO getAppointmentById(@PathVariable Long id) {
        return appointmentService.getAppointmentById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AppointmentDTO createAppointment(
            @RequestBody AppointmentDTO appointment
    ) {
        return appointmentService.createAppointment(appointment);
    }
}