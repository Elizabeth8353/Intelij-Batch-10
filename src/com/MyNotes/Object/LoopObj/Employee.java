package com.MyNotes.Object.LoopObj;

public class Employee {
    String name;
    String id;
    double salary;
    String dept;

    void work() {
        System.out.println(name + " is working in " + dept + " and id #" + id);
    }

    void job() {
        System.out.println(name + " salary is the fallowing " + salary);
    }
}
    class Tester{
        public static void main(String[] args) {
            Employee obj=new Employee();//By using Employee class as type we can create many objs using the classes fields and behaviours
            obj.name="Eli";
            obj.salary=1000.00;
            obj.dept="It";
            obj.id="123";
            obj.job();
            obj.work();

            Employee obj2=new Employee();
            obj2.name="Brianna";
            obj2.salary=10.00;
            obj2.dept="School";
            obj2.id="156";
            obj2.job();
            obj2.work();
            System.out.println("====================looping=========================");
Employee[] employees=new Employee[2];//storing our objs in type
employees[0]=obj;
employees[1]=obj2;

//using this loop print the values of Employee objects and call the methods

            for (int i = 0; i <employees.length ; i++) {
                System.out.println("name= "+employees[i].name);
                System.out.println("salary= "+employees[i].salary);
                System.out.println("Dep= "+employees[i].dept);
                System.out.println("id= "+employees[i].id);
                employees[i].job();
                employees[i].work();

            }
            System.out.println("======================For Enhanced loop===============================");
            for (Employee E:employees) {
                System.out.println(E.name);
                E.work();
                E.job();
            }
        }
    }

