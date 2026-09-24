package com.ticketapp;

class Calculator{
    int add (int a ,int b){
        return a+b;
    }

    int add(int a,int b,int c){
        return a+b+c;
    }

}

class Animal{
    void makeSound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{
    @Override
    void makeSound() {
        System.out.println("Dog makes a sound");
    }
}


public class Polymophism {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result1 =calculator.add(1,2,3);
       int result2 = calculator.add(10,20);
        System.out.println(result1+" "+result2);

        Dog dog = new Dog();
        dog.makeSound();
    }
}
