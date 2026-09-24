package com.ticketapp;

class Vehicle{
     String brand = "Toyota";

    void startEngine(){
        System.out.println("Engine Started ...");
    }
}

class Car extends Vehicle{
     int numberOfDoors = 4;

    void displayInfo(){
        System.out.println("Brand :"+brand+" Doors :"+numberOfDoors);
    }
}


public class Inheritance {
    public static void main(String[] args) {

        Car car = new Car();
        car.startEngine();
        car.displayInfo();
    }

}
