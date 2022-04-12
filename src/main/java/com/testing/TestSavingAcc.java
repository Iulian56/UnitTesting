package com.testing;
public class TestSavingAcc {
    public static void main(String[] args) {
        SavingAccounts person1 = new SavingAccounts("B000001", 9000);
        SavingAccounts person2 = new SavingAccounts("B000002", 3000);

        person1.setAnnualInterestRate(0.07);
        person1.calculateMonthlyInterests();

        person2.setAnnualInterestRate(0.05);
        person2.calculateMonthlyInterests();

        System.out.println(person1.getSavingsBalance());
        System.out.println(person2.getSavingsBalance());


        person1.calculateMonthlyInterests();
        person2.calculateMonthlyInterests();

        System.out.println(person1.getSavingsBalance());
        System.out.println(person2.getSavingsBalance());

        SavingAccounts.transferMoney(person1, person2, 700);

        System.out.println(person1.getSavingsBalance());
        System.out.println(person2.getSavingsBalance());
    }
}
