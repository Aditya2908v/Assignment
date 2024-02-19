package com.account;
public class Main {
    public static void main(String[] args) {

        Account acc1=new Account(123,"aditya",2000);

        try{
            acc1.deposit(1000);
            acc1.withDraw(10000);
        }catch (InvalidAmountException | InsufficientBalanceException ex){
            System.out.println(ex.getMessage());
        }
    }
}