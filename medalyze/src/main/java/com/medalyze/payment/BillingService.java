package com.medalyze.payment;

public class BillingService {

    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void processPayment(double amount) {
        if (strategy == null) {
            System.out.println("No payment strategy selected!");
            return;
        }
        strategy.pay(amount);
    }
}
