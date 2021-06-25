package com.morgage.model;

public class Applicant {
    boolean decision = false;
    long dti, creditScore, savings, requestedAmount;
    public Applicant(long dti, long creditScore, long savings, long requestedAmount) {
        this.dti = dti;
        this.creditScore = creditScore;
        this.savings = savings;
        this.requestedAmount = requestedAmount;

    }
    public Applicant() {
        dti = creditScore= savings=requestedAmount=0;
        decision = false;
    }
    public boolean accepts() {
        return decision;
    }
    public void decide(int i) {
        if (i==1)  {
            decision = true;
        } else {
            decision = false;
        }
    }
}
