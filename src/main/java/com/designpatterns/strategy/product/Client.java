package com.designpatterns.strategy.product;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        List<Product> allProducts = client.getAllProducts();

        for( Product p: allProducts ) {
            ProductImpl p1 = (ProductImpl) p;
            System.out.println( "For product  = " +p1.getProductName() + " specific value = " + p1.getProductSpecificParam());
        }
    }

    private List<Product> getAllProducts() {
        List<Product> allProducts = new ArrayList<>();

        Equity equity = new Equity();
        equity.setProductId(1);
        equity.setProductName("Equity product");
        equity.setSharesOutStanding(100);

        allProducts.add(equity);

        Option option = new Option();
        option.setProductId(2);
        option.setProductName("Option product");
        option.setStrikePrice(11.11);

        allProducts.add(option);

        Bond bond = new Bond();
        bond.setProductId(3);
        bond.setProductName("Bond product");
        bond.setParValue(200);

        allProducts.add(bond);
        return allProducts;
    }
}
