package com.medalyze.payment;

public class CashPaymentStrategy implements PaymentStrategy {

    public void pay(double amount) {
        System.out.println("[Payment] Cash payment: " + amount);
    }
}
