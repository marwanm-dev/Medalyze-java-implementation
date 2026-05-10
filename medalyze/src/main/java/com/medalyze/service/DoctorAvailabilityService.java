package com.medalyze.service;

import org.springframework.stereotype.Service;

@Service
public class DoctorAvailabilityService {

    public boolean isDoctorAvailable(
            Long doctorId,
            String date,
            String time
    ) {

        // Demo logic:
        // doctor unavailable at 12:00

        return !time.equals("12:00");
    }
}