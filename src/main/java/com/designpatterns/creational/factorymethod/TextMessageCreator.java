package com.designpatterns.creational.factorymethod;

import com.designpatterns.creational.factorymethod.message.Message;
import com.designpatterns.creational.factorymethod.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {


    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
