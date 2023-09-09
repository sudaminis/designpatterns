package com.designpatterns.behavioural.chainofresponsibility;

//This represents a handler in chain of responsibility
public interface LeaveApprover {

    void processLeaveApplication(LeaveApplication leaveApplication );
    String getApproverRole();

}
