package com.designpatterns.creational.factorymethod;

import com.designpatterns.creational.factorymethod.message.Message;

/**
 * This is our abstract "creator". 
 * The abstract method createMessage() has to be implemented by
 * its subclasses.
 */
public abstract class MessageCreator {

    public Message getMessage() {
        Message message = createMessage();
        message.addDefaultHeaders();
        message.encrypt();
        return message;
    }
    // this is our factory method - this will be implemented in our sublcasses
    public abstract Message createMessage();

}
