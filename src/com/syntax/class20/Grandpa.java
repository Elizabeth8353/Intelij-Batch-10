package com.syntax.class20;

public class Grandpa {
    /*Write program for multilevel inheritance where class A inherited by B and class B inherit class by C.
     */
    String name;
    int age;
    char gender;
    String favoriteFood;


    public Grandpa(){
        name="Grandpa";
        age=65;
        gender='M';
        favoriteFood="soup";


    }
    void eat(){
        System.out.println(name+" Like to eat "+favoriteFood);
    }
    void sleeps(){
        System.out.println(name+" is sleeping Zzzzz");
    }

}
