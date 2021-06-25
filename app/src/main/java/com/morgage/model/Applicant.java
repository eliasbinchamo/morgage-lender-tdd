package com.morgage.model;

public class Applicant {
    long dti, creditScore, savings, requestedAmount;
    public Applicant(long dti, long creditScore, long savings, long requestedAmount) {
        this.dti = dti;
        this.creditScore = creditScore;
        this.savings = savings;
        this.requestedAmount = requestedAmount;
    }

    public Applicant() {
        dti = creditScore= savings=requestedAmount=0;
    }
}
