package com.designpatterns.structural.facade;
import com.designpatterns.structural.facade.email.EmailFacade;

public class Client {

	public static void main(String[] args) {
		Order order = new Order("101", 99.99);
		EmailFacade facade = new EmailFacade();

		boolean result = facade.sendOrderemail(order);
		
		System.out.println("Order Email "+ (result?"sent!":"NOT sent..."));
		
	}

	/**
	private static boolean sendOrderEmailWithoutFacade(Order order) {
		Template template = TemplateFactory.createTemplateFor(TemplateType.Email);
		Stationary stationary = StationaryFactory.createStationary();
		Email email = Email.getBuilder()
					  .withTemplate(template)
					  .withStationary(stationary)
					  .forObject(order)
					  .build();
		Mailer mailer = Mailer.getMailer();
		return mailer.send(email);
	} **/
	
}
