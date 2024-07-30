// src/com/example/adapters/SquareAdapter.java
package com.example.adapters;

import com.example.payment.PaymentProcessor;
import com.example.gateways.Square;

public class SquareAdapter implements PaymentProcessor {
    private Square square;

    public SquareAdapter(Square square) {
        this.square = square;
    }

    @Override
    public void processPayment(double amount) {
        square.transferPayment(amount);
    }
}
