package com.medalyze.service;

import com.medalyze.dto.AppointmentDTO;
import com.medalyze.model.Appointment;

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

    public AppointmentDTO updateAppointment(Long id, AppointmentDTO updatedAppointment) {
      for (AppointmentDTO appointment : appointments) {
          if (appointment.getId().equals(id)) {
              appointment.setPatientId(updatedAppointment.getPatientId());
              appointment.setDoctorId(updatedAppointment.getDoctorId());
              appointment.setAppointmentDate(updatedAppointment.getAppointmentDate());
              appointment.setAppointmentTime(updatedAppointment.getAppointmentTime());
              appointment.setStatus(updatedAppointment.getStatus());
              return appointment;
          }
      }
    return null;
    }

    public boolean deleteAppointment(Long id) {
      return appointments.removeIf(a -> a.getId().equals(id));
    }
}