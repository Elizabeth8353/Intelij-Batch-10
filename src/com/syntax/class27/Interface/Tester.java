package com.syntax.class27.Interface;

public class Tester {
    public static void main(String[] args) {
        Car car = new Mercedes();
        car.start();
        car.stop();
        Drivable drivable=new Mercedes();
        drivable.drive();
       // drivable.start(); not possible method does not exist in Drivable Interface
        ((Mercedes)drivable).start(); //downcast to access start method

    }

}
