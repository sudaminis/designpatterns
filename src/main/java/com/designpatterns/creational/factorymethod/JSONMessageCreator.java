package com.designpatterns.creational.factorymethod;

import com.designpatterns.creational.factorymethod.message.JSONMessage;
import com.designpatterns.creational.factorymethod.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
