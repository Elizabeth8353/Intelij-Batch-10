package com.syntax.class20;

import com.syntax.class21.Employee;

public class EmployeeOtherPackage extends Employee {
    String empId;
    double salary;
    void work(){
        System.out.println();
    }
    void getPaid(){
        System.out.println(empId+" is paid "+salary);
    }
    public static void takeLeave(){
        System.out.println("employee can take leave");
    }
}
