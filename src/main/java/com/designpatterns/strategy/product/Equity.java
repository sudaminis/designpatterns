package com.designpatterns.strategy.product;

public class Equity extends ProductImpl {

    int sharesOutStanding;

    public int getSharesOutStanding() {
        return sharesOutStanding;
    }

    public void setSharesOutStanding(int sharesOutStanding) {
        this.sharesOutStanding = sharesOutStanding;
    }

    @Override
    public double getProductSpecificParam() {
        return sharesOutStanding;
    }
}
