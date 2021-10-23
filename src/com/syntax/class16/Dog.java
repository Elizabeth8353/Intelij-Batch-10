package com.syntax.class16;

public class Dog {
    String name; //instant variable
    static String Breed; //static variables; this single var will be shared across all objects of this class
    //not a good idea to put breed as static since breed can be diffrent for each object
    String color;

    void bark(){
        int times=10;//local variables
        for (int i = 0; i <times ; i++) {
            System.out.println("Dog can bark");
        }

    }
}
