package com.example.test;
import com.example.payment.PaymentProcessor;
import com.example.adapters.PayPalAdapter;
import com.example.adapters.StripeAdapter;
import com.example.adapters.SquareAdapter;
import com.example.gateways.PayPal;
import com.example.gateways.Stripe;
import com.example.gateways.Square;

public class PaymentTest {
    public static void main(String[] args) {
        PaymentProcessor paypalProcessor = new PayPalAdapter(new PayPal());
        PaymentProcessor stripeProcessor = new StripeAdapter(new Stripe());
        PaymentProcessor squareProcessor = new SquareAdapter(new Square());

        paypalProcessor.processPayment(100.0);
        stripeProcessor.processPayment(200.0);
        squareProcessor.processPayment(300.0);
    }
}
