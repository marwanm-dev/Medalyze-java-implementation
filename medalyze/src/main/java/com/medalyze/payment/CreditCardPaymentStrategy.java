package com.medalyze.payment;

public class CreditCardPaymentStrategy implements PaymentStrategy {

    public void pay(double amount) {
        System.out.println("[Payment] Credit Card payment: " + amount);
    }
}
