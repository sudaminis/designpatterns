package com.designpatterns.strategy;

import java.util.Collection;
import java.util.Iterator;

//Concrete strategy
public class SummaryPrinter implements OrderPrinter {


    @Override
    public void print(Collection<Order> orders) {
        System.out.println("Summary Report");
        Iterator<Order> orderIterator = orders.iterator();
        double total = 0.0;
        for( Order o: orders) {
            System.out.println(o.getId() + " " + o.getDate() + " " + o.getItems().size() + " " + o.getTotal());
            total += o.getTotal();
        }
        System.out.println("********");
        System.out.println("Total = " +total);
    }
}
