package com.syntax.class18;

public class Car {
    String model;
    String make;
    int year;
    String color="white";

    Car(String carModel,String carMake,int carYear){
        model=carModel;
        make=carMake;
        year=carYear;
    }
    void printCarinfo(){
        System.out.println("Model "+model+" Make "+make+" Year "+year);
    }
}
