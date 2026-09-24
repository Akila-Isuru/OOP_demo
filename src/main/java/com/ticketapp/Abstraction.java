package com.ticketapp;

interface PaymentMethod{
    void pay(double amount);   // Abstract Method (Implementation එකක් නෑ)

}

class CreditCard implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
    }
}

class PayPalPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using PayPal.");
    }
}

public class Abstraction {
    public static void main(String[] args) {
       PaymentMethod [] payments = {new CreditCard(), new PayPalPayment()};
       double [] amounts = {100.0,250.0};

       for(int i =0;i<payments.length;i++){
           payments[i].pay(amounts[i]);
       }
    }

}
