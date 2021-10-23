package com.syntax.class22;

public class Employee extends Person{

    public Employee(String name, int age, double height, double weight) {
        super(name, age, height, weight);//only one level of inheritance constructor imidiate parent class
        //because we need to initialize the fields of our parent class
        //super can only be used once

    }
    Employee(String name, int age,double height){
        super(name,age,height);//must have matching cons as parent class
    }
    void getPain(){
       // super("name",10,10,10);not allowed to
    }

    public static void main(String[] args) {
        Employee employee=new Employee("Oxana",16,5.5,35);
        employee.eat();
        employee.sleep();
        System.out.println(employee.name);
        System.out.println(employee.age);
        System.out.println(employee.height);
        System.out.println(employee.weight);
    }
}
