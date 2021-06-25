package com.morgage.model;

public class Applicant {
    boolean decision;
    long dti, creditScore, savings, requestedAmount;
    public Applicant(long dti, long creditScore, long savings, long requestedAmount) {
        this.dti = dti;
        this.creditScore = creditScore;
        this.savings = savings;
        this.requestedAmount = requestedAmount;
        this.decision = false;
    }
    public Applicant() {
        dti = creditScore= savings=requestedAmount=0;
        decision = false;
    }
    public void decide(String decide) {
        if (decide.equals("accept"))  {
            System.out.println("Offer Accepted");
            decision = true;
        } else if(decide.equals("decline")){
            decision = false;
        }
        else{
            decision = false;
        }
    }
    public boolean accepts() {
        return decision;
    }
}
