package com.designpatterns.structural.adapter.classadapter;

/**
 * Client code which requires Customer interface.
 * this prints business cards
 */
public class BusinessCardDesigner {

	public String designCard(Customer customer) {
		String card = "";
		card += customer.getName();
		card += "\n" + customer.getDesignation();
		card += "\n" + customer.getAddress();
		return card;
	}
}
