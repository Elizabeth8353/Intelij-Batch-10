package com.syntax.class18;

public class Person {
    String name;
    int age;
    String country;
    //Person(){
     //   System.out.println("Inside constructor");
    //}
    void printinfo(){
        System.out.println("Name "+name+" Age "+age+" Country "+country);
    }
    Person(String personName,int personAge,String countries){
        name=personName;
        age=personAge;
        country=countries;

    }
}
