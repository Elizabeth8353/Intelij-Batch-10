package com.syntax.class24.OverridingDemo;

public class Employee {
    double salary;
    String name;
    Employee (String name,double salary){
        this.salary=salary;
        this.name=name;
    }
    void getPaid(){
        System.out.println(name+" is getting paid "+salary+" /anum");
    }

}
class Contractors extends Employee{

    Contractors(String name, double salary) {
        super(name, salary);
    }
    @Override  //annotation help us make sure we are properly overriding to avoid error
    void getPaid(){
        System.out.println(name+" is getting paid "+salary+"/hourly");
    }
}
class FullTimeEmployee extends Employee{

    FullTimeEmployee(String name, double salary) {
        super(name, salary);
    }

    public static void main(String[] args) {

    }
}
