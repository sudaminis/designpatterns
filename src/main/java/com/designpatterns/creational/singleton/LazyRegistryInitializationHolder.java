package com.designpatterns.creational.singleton;

/*
Uses lazy initialization holder class without need to synchronize
 */
public class LazyRegistryInitializationHolder {

    private LazyRegistryInitializationHolder() {
        System.out.println("In LazyRegistry holder");
    }

    private static class RegistryHolder {
        static LazyRegistryInitializationHolder INSTANCE = new LazyRegistryInitializationHolder();
    }

    public static LazyRegistryInitializationHolder getInstance() {
        return RegistryHolder.INSTANCE;
    }

}
