package com.designpatterns.strategy.product;

public class ProductImpl implements Product {

    int productId;
    String productName;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public double getProductSpecificParam() {
        return 0;
    }
}
