package com.designpatterns.behavioural.chainofresponsibility;

//Abstract handler
public abstract class Employee implements LeaveApprover {
    private String role;

    private LeaveApprover successor;

    public Employee(String role, LeaveApprover successor) {
        this.role = role;
        this.successor = successor;
    }

    @Override
    public void processLeaveApplication(LeaveApplication leaveApplication) {
        if( !processRequest(leaveApplication) && successor != null ) {
            successor.processLeaveApplication(leaveApplication);
        }
    }

    @Override
    public String getApproverRole() {
        return role;
    }

    protected abstract boolean processRequest(LeaveApplication application);
}