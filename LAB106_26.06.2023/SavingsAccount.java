package com.mycompany.lab9;


public class SavingsAccount extends BankAccount{
    @Override
    int calculateinterest(){
        
    return getbalance()*12/100;       
    }
}
