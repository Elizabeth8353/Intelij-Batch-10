package com.syntax.class21;

public class Employee extends Person{
    String empId;
    double salary;
    void work(){
        System.out.println("employee "+empId+"having age "+age+"is");

    }
    void getPaid(){
        System.out.println(empId+" is paid "+salary);
    }
}
