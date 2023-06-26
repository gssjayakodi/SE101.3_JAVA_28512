package com.mycompany.lab9;


public class CheckingAccount extends BankAccount {
     @Override
    int calculateinterest(){
    return getbalance()*2/100; 
    }
}
