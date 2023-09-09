package com.designpatterns.strategy.product;

public class Option extends ProductImpl {

    double strikePrice;

    public double getStrikePrice() {
        return strikePrice;
    }

    public void setStrikePrice(double strikePrice) {
        this.strikePrice = strikePrice;
    }

    @Override
    public double getProductSpecificParam() {
        return strikePrice;
    }
}
