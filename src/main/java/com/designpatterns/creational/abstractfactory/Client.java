package com.designpatterns.creational.abstractfactory;

import com.designpatterns.creational.abstractfactory.aws.AwsResourceFactory;
import com.designpatterns.creational.abstractfactory.gcp.GoogleResourceFactory;

// we compose classes using concrete instances
public class Client {

    private ResourceFactory factory;

    public Client(ResourceFactory factory) {
        this.factory = factory;
    }

    public Instance createServer(Instance.Capacity cap, int storageMib) {
        Instance instance = factory.createInstance(cap);
        Storage storage = factory.createStorage(storageMib);
        instance.attachStorage(storage);
        return instance;
    }
    public static void main(String[] args) {
    	Client aws = new Client(new AwsResourceFactory());
        Instance i1 = aws.createServer(Instance.Capacity.micro, 20480);
        i1.start();
        i1.stop();

        System.out.println("**********");

        Client google = new Client(new GoogleResourceFactory());
        Instance i2 = google.createServer(Instance.Capacity.micro, 20480);
        i2.start();
        i2.stop();

    }

}
