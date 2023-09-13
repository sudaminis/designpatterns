package com.designpatterns.structural.facade.email;

import com.designpatterns.structural.facade.Order;
import com.designpatterns.structural.facade.email.Template.TemplateType;

//Facade provides simple methods for client to use
public class EmailFacade {

    public boolean sendOrderemail( Order order) {
        Template template = TemplateFactory.createTemplateFor(TemplateType.Email);
        Stationary stationary = StationaryFactory.createStationary();
        Email email = Email.getBuilder()
                .withTemplate(template)
                .withStationary(stationary)
                .forObject(order)
                .build();
        Mailer mailer = Mailer.getMailer();
        return mailer.send(email);
    }
	
}
