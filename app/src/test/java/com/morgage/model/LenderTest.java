package com.morgage.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LenderTest {
   //As a lender, I want to be able to check my available funds, so that I know how much money I can offer for loans.
    @Test
    public void testLenderCheckFunds(){
        Lender lender = new Lender();
        long expected = 0;

        assertEquals(lender.getFunds(), expected);
        //assertTrue(lender.hasFunds());
    }

}
