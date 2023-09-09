package com.designpatterns.creational.singleton;

public class LazyRegistristryWithDCL {

    private LazyRegistristryWithDCL() {

    }

    private static volatile LazyRegistristryWithDCL INSTANCE;

    public static LazyRegistristryWithDCL getInstance() {
        if( INSTANCE == null ) {
            synchronized (LazyRegistristryWithDCL.class) {
                if( INSTANCE == null ) {
                    INSTANCE = new LazyRegistristryWithDCL();
                }
            }
        }
        return INSTANCE;
    }
}
