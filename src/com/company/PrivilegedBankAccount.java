package com.company;

public class PrivilegedBankAccount extends UsualBankAccount {

    PrivilegedBankAccount(String name,long phoneNumber,int InitialDeposit){
        super(name,phoneNumber,0);
    }

    //considering the situation where bank is ready to give loan
     public void eligibleLoanValue(int assetValue){
         System.out.println(0.7*assetValue);
     }

}

