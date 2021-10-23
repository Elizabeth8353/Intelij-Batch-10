package com.syntax.class19;


public class Hw1 {
    /*Write a program that will have a constructor: one with parameters and second without any parameters.
     Create a separate Test class where you will execute both of the constructors 1 by 1.
     */
    String name;

    Hw1(String Cname){
        name=Cname;
        System.out.println("I am constructor with parameter initialized "+name);
    }
    Hw1(){
        name="eli";
        System.out.println("I am constructor without parameter "+name);

    }


}
