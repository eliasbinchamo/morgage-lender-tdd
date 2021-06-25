package com.morgage.model;

import java.util.ArrayList;
import java.util.List;

public class Lender {
    private long funds;
    private long pendingFunds;
    private List<Applicant> pendingRequests = new ArrayList<>();
    private List<Applicant> approvedRequests = new ArrayList<>();
//    private HashMap<>

    public Lender(){
        funds = 0;
        pendingFunds = 0;
    }

    public long getFunds() {
        return funds;
    }
    public boolean hasFunds() {
        return funds>0;
    }
    public void checkFunds() {
        System.out.println("Available funds: "+ getFunds());
    }
    public void checkPendingFunds(){
        System.out.println("Pending funds: "+ getPendingFunds());

    }
    public void addFunds(long amount) {
        funds+=amount;
    }

    public boolean willApprove(long requestedLoanAmount) {
        return requestedLoanAmount<funds;
    }

    public boolean qualifyLoans(Applicant applicant) {
        if (applicant.dti < 36) {
            if (applicant.creditScore > 620) {
                if (applicant.savings / 4 > applicant.requestedAmount) {
                    return true;
                }
            }
        }
        return false;
    }
    public long getPendingFunds() {
        return pendingFunds;
    }

    public void addRequests(Applicant applicant) {

        if (qualifyLoans(applicant)) {
            pendingRequests.add(applicant);
            funds -= applicant.requestedAmount;
            pendingFunds += applicant.requestedAmount;
//        } else {
//            pendingRequests.add(applicant);
////            pendingFunds += applicant.requestedAmount;
//        }

        }
    }

    public void sendOffer(Applicant applicant) {

        if(applicant.accepts()) {
            approvedRequests.add(applicant);
            funds -= applicant.requestedAmount;
            System.out.println("Applicant accepted offer");
        } else {
            pendingRequests.remove(applicant);
        }
    }
}
