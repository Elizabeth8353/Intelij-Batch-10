package com.syntax.class19;

public class Person {
    /*Write a program that will have a constructor: one with parameters and
    second without any parameters. Create a separate Test class where you will execute both of the constructors 1 by 1.
     */
    //this(); should always be in first line
    String name;
    int age;
    double weight;
    double height;
    String education;
    Person(){
        System.out.println(" Important lines of code that should alswas be executed");
        name="none";
        age=30;
        height=5.5;
        education="none";
    }
    Person(String PersonName){
        this();//calls no argument constructor
        System.out.println("first constructor");
        name=PersonName;
       // age=30;
       // weight=50;  we dont need these lines because the constructor being called will initialize them
        //height=5.5;
       // education="none";
    }
Person(String personName,int personAge){
        this(personName);
    System.out.println("Second constructor");
    //name=personName;
    age=personAge;
    //weight=50;
    //height=5.5;
   // education="None";
}
void printInfo(){
    System.out.println("Name "+name+" age "+age+" weight "+weight+" height "+height+" education "+education);
}
    Person(int personAge,String personName){
        name=personName;
        age=personAge;
        weight=50;
        height=5.5;
        education="None";
    }

}
