package com.example.adapters;

import com.example.payment.PaymentProcessor;
import com.example.gateways.PayPal;

public class PayPalAdapter implements PaymentProcessor {
    private PayPal payPal;

    public PayPalAdapter(PayPal payPal) {
        this.payPal = payPal;
    }

    @Override
    public void processPayment(double amount) {
        payPal.makePayment(amount);
    }
}