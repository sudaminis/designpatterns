package com.designpatterns.creational.abstractfactory.gcp;

import com.designpatterns.creational.abstractfactory.Instance;
import com.designpatterns.creational.abstractfactory.ResourceFactory;
import com.designpatterns.creational.abstractfactory.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {


    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new GoogleCloudStorage(capMib);
    }
}
