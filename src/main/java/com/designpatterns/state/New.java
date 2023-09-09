package com.designpatterns.state;

public class New implements OrderState {


    @Override
    public double handleCancellation() {
        System.out.println("Its a new order, no processing done");
        return 0;
    }
}
