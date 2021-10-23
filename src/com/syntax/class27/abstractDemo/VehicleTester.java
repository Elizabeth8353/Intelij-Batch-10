package com.syntax.class27.abstractDemo;

public class VehicleTester {
    public static void main(String[] args) {
        BMW bmw=new BMW("BMW","X5","123","Sedan");
        bmw.drive();
        bmw.start();
        bmw.stop();
       // bmw.toString(); coming from our OBJECT class all classes are automatically inherit from that class
        bmw.displayInfo();
        Vehicle.displayTotalVehicles();

        Car car=new Toyota("Toyota","Yaris","Sedan","1452");
        ((Toyota)car).displayInfo();

    }
}
