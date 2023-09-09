package com.designpatterns.behavioural.chainofresponsibility;
//A concrete handler

public class Manager extends Employee {
    static final String role = "Manager";

	public Manager(LeaveApprover nextApprover) {
		super(role, nextApprover);
	}
	
	@Override
	protected boolean processRequest(LeaveApplication application) {
		switch (application.getType()) {
		case Sick:
			application.approve(getApproverRole());
			return true;
		case PTO:
			if(application.getNoOfDays() <= 5) {
				application.approve(getApproverRole());
				return true;
			}
		}
		return false;
	}
	
}