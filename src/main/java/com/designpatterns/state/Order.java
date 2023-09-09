package com.designpatterns.state;

//Context class
public class Order {

	public Order() {
		this.currentState = new New();
	}

	private OrderState currentState;
	public double cancel() {
		double charges = currentState.handleCancellation();
		currentState = new Cancelled();
		return charges;
	}
   
	public void paymentSuccessful() {
		currentState = new Paid();
	}
	
	public void dispatched() {
		currentState = new InTransit();
	}
	
	public void delivered() {
		currentState = new Delivered();
	}
}
