package com.syntax.class17;

public class EmployeeTester {
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.empId="123";
        employee.salary=10000;
        System.out.println(employee.empId);
        System.out.println(employee.salary);
        System.out.println(Employee.Ceo);


    }
}
