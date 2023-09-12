package com.designpatterns.creational.abstractfactory;

//Represents an abstract product
// represents compute resource from Google cloud and AWS
//generic methods that can be called regardless of what we are going to use
public interface Instance {
    enum Capacity{micro, small, large}

    void start();

    void attachStorage(Storage storage);

    void stop();
}
