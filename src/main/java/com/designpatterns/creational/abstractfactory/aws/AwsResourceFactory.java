package com.designpatterns.creational.abstractfactory.aws;

import com.designpatterns.creational.abstractfactory.Instance;
import com.designpatterns.creational.abstractfactory.ResourceFactory;
import com.designpatterns.creational.abstractfactory.Storage;

//Factory implementation for Google cloud platform resources
public class AwsResourceFactory implements ResourceFactory {


    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new S3Storage(capMib);
    }
}
