package com.medalyze.payment;

public class InsurancePaymentStrategy implements PaymentStrategy {

    public void pay(double amount) {
        System.out.println("[Payment] Insurance payment: " + amount);
    }
}
