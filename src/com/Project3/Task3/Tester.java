package com.Project3.Task3;

public class Tester {
    public static void main(String[] args) {

        Sedan car = new Sedan(1000.0, "black", 5);
        System.out.println(car.calculateSalePrice(5000.0));

        Truck truck=new Truck(4000,"black",4);
        System.out.println(truck.calculateSalePrice(4000));

    }
}
