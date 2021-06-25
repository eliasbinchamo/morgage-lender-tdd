package com.morgage.model;

public class Lender {
    private long funds;
    private long pendingFunds;

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
}
