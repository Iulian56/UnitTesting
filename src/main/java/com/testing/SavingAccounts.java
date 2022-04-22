package com.testing;

public class SavingAccounts {
    private double annualInterestRate;
    private double savingsBalance;
    private String identificationCode;

    SavingAccounts (String identificationCode, int savingsBalance){
        this.identificationCode = identificationCode;
        this.savingsBalance = savingsBalance;
    }


    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public String getIdentificationCode() {
        return identificationCode;
    }

    public void setIdentificationCode(String identificationCode) {
        this.identificationCode = identificationCode;
    }

    public double calculateMonthlyInterests(){
        if (savingsBalance > 0) {
            savingsBalance = ((savingsBalance * annualInterestRate) / 12);
            return savingsBalance;
        }
        return savingsBalance;
    }

    public  void modifyRate(double newRate){
        annualInterestRate = newRate;
    }

    public static void transferMoney(SavingAccounts personWhoTransfers, SavingAccounts personWhoReceives, double sum){
        System.out.println("Payee's balance before transaction: " + personWhoTransfers.savingsBalance + " $");
        System.out.println("Receiver's balance before transaction: " + personWhoReceives.savingsBalance + " $");

        if (personWhoTransfers.savingsBalance < sum){
            System.out.println(personWhoTransfers.savingsBalance + " Currently you don't have this founds");
        }

        personWhoTransfers.savingsBalance -= sum;
        personWhoReceives.savingsBalance += sum;

        System.out.println("Payee's balance after transaction: " + personWhoTransfers.savingsBalance + " $");
        System.out.println("Receiver's balance after transaction: " + personWhoReceives.savingsBalance + " $");
    }
}
