package com.designpatterns.behavioural.chainofresponsibility;

//A concrete handler
public class ProjectLead extends Employee {

    static final String role = "Project Lead";
    public ProjectLead(LeaveApprover successor) {
        super(role, successor);
    }

    @Override
    protected boolean processRequest(LeaveApplication application) {
        // type of leave is sick leave for duration = 2 days
        if( application.getType().equals(LeaveApplication.Type.Sick) && application.getNoOfDays() <= 2) {
            application.approve(role);
            return true;
        }
        return false;
    }
}
