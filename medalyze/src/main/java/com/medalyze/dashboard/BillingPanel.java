package com.medalyze.dashboard;

public class BillingPanel extends DashboardPanel {

    public BillingPanel(DashboardMediator mediator) {
        super(mediator);
    }

    public void refresh() {
        System.out.println("BillingPanel: Refreshing billing info...");
    }
}