package com.medalyze.controller;

import com.medalyze.dto.AppointmentDTO;
import com.medalyze.service.AppointmentWorkflowService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/workflow")
public class WorkflowController {

    private final AppointmentWorkflowService workflowService;

    public WorkflowController(
            AppointmentWorkflowService workflowService
    ) {
        this.workflowService = workflowService;
    }

    @PostMapping("/book-appointment")
    @ResponseStatus(HttpStatus.CREATED)
    public AppointmentDTO bookAppointment(
            @RequestBody AppointmentDTO request
    ) {

        return workflowService.bookAppointmentWorkflow(
                request
        );
    }
}