package com.medalyze.adapter.payment;

public class PaymentGatewayAdapter implements PaymentProcessor {

    private ExternalPaymentGateway externalGateway;

    public PaymentGatewayAdapter() {
        this.externalGateway = new ExternalPaymentGateway();
    }

    @Override
    public void processPayment(double amount) {
        // Adapt method
        externalGateway.makeTransaction(amount);
    }
}