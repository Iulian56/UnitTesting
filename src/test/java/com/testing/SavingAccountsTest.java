package com.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class SavingAccountsTest {

    @Test
    public void calculateMonthlyInterestsTestInvalidData(){
        SavingAccounts person1 = new SavingAccounts("B000001", -1000);
        person1.setAnnualInterestRate(0.02);
        double actual = person1.calculateMonthlyInterests();

        assertEquals(-1000,actual);
    }

    @Test
    public void calculateMonthlyInterests(){
        SavingAccounts person2 = new SavingAccounts("B000002", 9000);
        person2.setAnnualInterestRate(0.10);
        double actual = person2.calculateMonthlyInterests();

        assertEquals(75.0, actual);
    }

    @Test
    public void getSavingsBalanceTest(){
        SavingAccounts person3 = new SavingAccounts("B000003", 9200);
        double expected = person3.getSavingsBalance();

        assertEquals(expected, 9200);
    }

    @Test
    public void getIdentificationCodeTest(){
        SavingAccounts person4 = new SavingAccounts("B000004", 8400);
        String expected = person4.getIdentificationCode();
        assertEquals(expected, "B000004");
    }
}