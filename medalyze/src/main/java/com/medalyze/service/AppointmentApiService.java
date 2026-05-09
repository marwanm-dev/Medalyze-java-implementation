package com.medalyze.service;

import com.medalyze.dto.AppointmentDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AppointmentApiService {

    private final List<AppointmentDTO> appointments = new ArrayList<>();

    public AppointmentApiService() {
        appointments.add(
                new AppointmentDTO(
                        1L,
                        101L,
                        201L,
                        "2026-05-15",
                        "10:30",
                        "Confirmed"
                )
        );
    }

    public List<AppointmentDTO> getAllAppointments() {
        return appointments;
    }

    public AppointmentDTO getAppointmentById(Long id) {
        return appointments.stream()
                .filter(a -> a.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public AppointmentDTO createAppointment(AppointmentDTO appointment) {
        appointment.setId((long) (appointments.size() + 1));
        appointments.add(appointment);
        return appointment;
    }
}