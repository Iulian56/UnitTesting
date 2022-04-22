package com.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


class SavingAccountsTest {

    @Test
    public void calculateMonthlyInterestsTestInvalidData(){
        SavingAccounts person1 = new SavingAccounts("B000001", -1000);
        person1.setAnnualInterestRate(0.02);
        double actual = person1.calculateMonthlyInterests();

        assertEquals(-1000,actual);
    }

    @Test
    public void calculateMonthlyInterestsTest2(){
        SavingAccounts person2 = new SavingAccounts("B000002", 9000);
        person2.setAnnualInterestRate(0.07);
        double actual = person2.calculateMonthlyInterests();

        assertNotEquals(9052.5, actual);
    }

    @Test
    public void getSavingsBalanceTest(){
        SavingAccounts person3 = new SavingAccounts("B000003", 9200);
        double expected = person3.getSavingsBalance();

        assertEquals(expected, 9200);
    }

}