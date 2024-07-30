// com/example/test/StrategyPatternExample.java
package com.example.test;

import com.example.context.PaymentContext;
import com.example.Strategy.CreditCardPayment;
import com.example.Strategy.PayPalPayment;
import com.example.Strategy.PaymentStrategy;

public class StrategyPatternExample {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Paying with Credit Card
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234567890123456", "John Doe", "123", "12/23");
        context.setPaymentStrategy(creditCardPayment);
        context.executePayment(100);

        // Paying with PayPal
        PaymentStrategy payPalPayment = new PayPalPayment("john@example.com", "mypassword");
        context.setPaymentStrategy(payPalPayment);
        context.executePayment(200);
    }
}
