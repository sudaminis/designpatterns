package com.designpatterns.state;

public class Cancelled implements OrderState {

    @Override
    public double handleCancellation() {
        throw new IllegalStateException("Cancelled order. Cant cancel again.");
    }
}
