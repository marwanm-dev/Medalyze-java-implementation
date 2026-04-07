package com.medalyze.payment;

public class ExternalPaymentGateway {

    public void makeTransaction(double amount) {
        System.out.println("Processing payment via External Gateway: $" + amount);
    }
}