package com.designpatterns.behavioural.chainofresponsibility;

//A concrete handler
public class Director extends Employee {
	public static final String role = "Director";
	public Director(LeaveApprover nextApprover) {
		super(role, nextApprover);
	}
	
	@Override
	protected boolean processRequest(LeaveApplication application) {
		if(application.getType() == LeaveApplication.Type.PTO) {
			application.approve(getApproverRole());
			return true;
		}
		return false;
	}
	
}
