package com.Review.class10;

public class Employee {
    Employee(){

        System.out.println("This employee is not good");
    }
    Employee(String name){

        System.out.println(name+" is a good employee");
    }

    public static void main(String[] args){
        new Employee();
        new Employee("Sharif");
    }
}
