package com.morgage.model;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class LenderTest {

    //setup
    Lender lender = new Lender();


    //As a lender, I want to be able to check my available funds, so that I know how much money I can offer for loans.
    @Test
    public void testLenderCheckFunds(){
        long expected = 0;
        assertEquals(lender.getFunds(), expected);
        lender.checkFunds();
        //assertTrue(lender.hasFunds());
    }
    //As a lender, I want to add money to my available funds, so that I can offer loans to potential home buyers.
    @Test
    public void testLenderAddFunds(){
        long previousAmount = lender.getFunds();
        long amount = 10000;
        lender.addFunds(amount);
        long expectedAmount = lender.getFunds();
        assertFalse(previousAmount==expectedAmount);
    }
    //As a lender, I want to approve or deny loans base on available funds, so that I don't go bankrupt.
    @Test
    public void testLenderAllowOrDenyLoans(){
        long requestedLoanAmount = 9000;
        lender.addFunds(43262);
        assertTrue(lender.willApprove(requestedLoanAmount));
    }
}
