package com.testing;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SavingAccountsTest {

    @Test
    public void checkInterestRatePerson1(){
        SavingAccounts person1 = new SavingAccounts("B000001", 1000);
        person1.setAnnualInterestRate(0.02);
        double actual = person1.calculateMonthlyInterests();

        assertEquals(1001.6666666666666,actual);
    }

    @Test
    public void checkInterestRatePerson2(){
        SavingAccounts person2 = new SavingAccounts("B000002", 9000);
        person2.setAnnualInterestRate(0.07);
        double actual = person2.calculateMonthlyInterests();

        assertNotEquals(9052.5, actual);
    }

    @Test
    public void currentSavingBalance(){
        SavingAccounts person3 = new SavingAccounts("B000003", 9200);
        double expected = person3.getSavingsBalance();

        assertEquals(expected, 9200);
    }

    @Test
    public void identificationCodeCheck(){
        SavingAccounts person4 = new SavingAccounts("B000004", 9500);
        String expected = person4.getIdentificationCode();

        assertEquals(expected, "B000003");
    }
}