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

}
