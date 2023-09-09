package com.designpatterns.creational.singleton;

public class Client {
    public static void main(String[] args) {
        EagerRegistry eagerRegistry = EagerRegistry.getInstance();
        EagerRegistry eagerRegistry1 = EagerRegistry.getInstance();

        System.out.println(eagerRegistry1 == eagerRegistry);

        LazyRegistristryWithDCL lazyRegistristryWithDCL = LazyRegistristryWithDCL.getInstance();

        LazyRegistryInitializationHolder holder = LazyRegistryInitializationHolder.getInstance();
    }
}
