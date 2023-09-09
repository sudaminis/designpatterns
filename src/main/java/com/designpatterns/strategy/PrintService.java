package com.designpatterns.strategy;


import java.util.LinkedList;

//Context 
public class PrintService {
    private OrderPrinter orderPrinter;
    public PrintService(OrderPrinter printer) {
        this.orderPrinter = printer;
    }

    public void printOrders(LinkedList<Order> orders) {
        orderPrinter.print(orders);
    }
}
