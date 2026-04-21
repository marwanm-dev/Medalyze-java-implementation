package com.medalyze.dashboard;

public abstract class DashboardPanel {

    protected DashboardMediator mediator;

    public DashboardPanel(DashboardMediator mediator) {
        this.mediator = mediator;
    }
}