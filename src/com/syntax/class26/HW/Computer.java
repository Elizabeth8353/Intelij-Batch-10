package com.syntax.class26.HW;

public class Computer {
    int mainMemory;
    double price;
    String make;
    Computer(){
        System.out.println("computer constructor");
    }
    /*Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
Define common behavior within and some fields in parent class and override some of the methods in child classes
Define some methods specific to child classes
Create objects of child classes and store them into array. Loop through each object and execute available methods.
     */

    void browserInternet(){
        System.out.println("You can browse internet on computer");
    }
    void openFiles(){
        System.out.println("You can open different file on Computer");
    }
}
class Apple extends Computer{
    Apple(){
        System.out.println("Apple constructor");
    }
void useItunes(){
    System.out.println("I can use Itunes");
}
@Override
    void browserInternet(){
        System.out.println("You can browse Apple on Safari");
    }

}
class Lenovo extends Computer{
    Lenovo(){
        System.out.println("Lenovo constructor");
    }
void VantageApp(){
    System.out.println("Use vantage app to custumize me ");
}
@Override
void browserInternet(){
    System.out.println("You can browse internet on lenovo using google chrome");
}
}
class HP extends Computer{
    HP(){
        System.out.println("Hp constructor");
    }
void HPsmartApp(){
    System.out.println("Use HpSmart app to customize me ");
}
@Override
    void browserInternet(){
        System.out.println("You can browse internet on HP on internet explorer");
    }
}
class Dell extends Computer{
    Dell(){
        System.out.println("Dell constructor");
    }
void DellSupportApp(){
    System.out.println("Use Dell support App to customize me");
}
@Override
void browserInternet(){
    System.out.println("You can browse internet on Dell on firefox");
}
}
