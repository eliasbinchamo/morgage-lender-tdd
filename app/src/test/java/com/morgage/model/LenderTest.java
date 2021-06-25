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
    //As a lender, I want to qualify loan applications, so that I can ensure I get my money back.
    @Test
    public void testLenderQualifyForLoan(){
        long requestedLoanAmount = 9000;
        lender.addFunds(43262);
        Applicant applicant = new Applicant(12,650,122523, 15000);
        assertTrue(lender.qualifyLoans(applicant));
    }

    @Test
    public void testLenderSeparatingFunds () {

        Applicant applicant = new Applicant(12,650,122523, 1000);
        lender.addFunds(10000);
        lender.getPendingFunds();
        long expected = lender.getFunds();
        lender.addRequests(applicant);

        lender.checkFunds();
        lender.checkPendingFunds();
        assertFalse(lender.getFunds() == expected);
    }

    @Test
    public void testLenderSendOffer() {
        Applicant applicant = new Applicant(12,650,122523, 1000);
        lender.addFunds(10000);
        long expected = lender.getFunds();
        lender.sendOffer(applicant);
        applicant.decide(1);
        lender.checkFunds();
        assertEquals(expected , lender.getFunds());
    }







    //As a lender, I want to keep pending loan amounts in a separate account
    // , so I don't extend too many offers and bankrupt myself.


}
