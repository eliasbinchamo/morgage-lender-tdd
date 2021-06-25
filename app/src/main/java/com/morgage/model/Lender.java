package com.morgage.model;

public class Lender {
    private long funds;

    Lender(){
        funds = 0;
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
}
