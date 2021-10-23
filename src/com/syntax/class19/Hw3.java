package com.syntax.class19;

public class Hw3 {
    /*3.  Write a program  that will have 4 different access levels of constructors and create 3 objects of this class:
     1 - inside same class; 2 - from outside the class; 3 - from different class inside different package  and observe result.
     */
    //Cannot declare exact conctructors need to have different parameters modifiers dont matter
    private Hw3(){
        System.out.println("Im inside Private constructor");
    }
    Hw3(String name){
        System.out.println("Default constructor");
    }
    public Hw3(int day){
        System.out.println("public constructor");
    }
    protected Hw3(boolean isRaining){

    }

    public static void main(String[] args) {
         Hw3 hw3=new Hw3();
    }

}
