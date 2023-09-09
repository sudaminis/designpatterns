package com.designpatterns.strategy.product;

public class Bond extends ProductImpl {

    int parValue;

    public int getParValue() {
        return parValue;
    }

    public void setParValue(int parValue) {
        this.parValue = parValue;
    }

    @Override
    public double getProductSpecificParam() {
        return parValue;
    }
}
