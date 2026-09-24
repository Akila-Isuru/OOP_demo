package com.ticketapp;

 class BankAccount{
     private String accName;
     private double balance;

     public BankAccount(String accName, double balance) {
         this.accName = accName;
         this.balance = balance;
     }
     public double getBalance() {
         return balance;
     }

     public void deposit(double amount) {
         if(amount>0){
             balance += amount;
             System.out.println("Deposited " + amount);
         }else {
             System.out.println("invalid amount");
         }

     }
 }


public class Encapsulation {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("ACC123", 1000.0);
        bankAccount.deposit(500.0);
        System.out.println("current balance is " + bankAccount.getBalance());

    }
}
