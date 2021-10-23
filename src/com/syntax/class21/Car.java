package com.syntax.class21;

public class Car {
    String model;
    String make;
    int year;
    Car(){
        System.out.println("Empty constructor with zero");
    }
    Car(String model){
        this.model=model;
        this.make=make;
        this.year=0;
    }
    Car(String model,String make){
        this(model);
        this.model=model;
        this.make=make;
        this.year=0;

    }

    public Car(String model, String make, int year) {
        this(model,make);
       // this.model = model;
       // this.make = make;
        this.year = year;
    }
    void printInfo(){
        String make="Honda";
        String model="Civic";
        int year=2022;
        System.out.println(this.model+make+this.year);
    }
}
