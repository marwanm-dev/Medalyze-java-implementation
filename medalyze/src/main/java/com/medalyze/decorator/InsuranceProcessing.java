package com.medalyze.decorator;
  public class InsuranceProcessing extends AppointmentDecorator {

    public InsuranceProcessing(AppointmentService appointment) {
        super(appointment);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Insurance Processing";
    }

    @Override
    public double getCost() {
        return super.getCost() + 20.0;
    }
}

