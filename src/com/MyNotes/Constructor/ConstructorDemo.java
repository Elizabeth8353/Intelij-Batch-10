package com.MyNotes.Constructor;

public class ConstructorDemo {
    String name;
    String lastname;
    int age ;
    int hours;
    double payTime;
    // with constructor call this() we can reduce the duplication by using this()
    //best to go in order/fallow the sequence from 0 to most parameters we will not be able to reduce the amount of duplicate code
    //or if we don't fallow sequence chain will break and we will not be able to utiloze half of the constructer calls or three constructor calls
    //so if we want to utiloze all the constructors their we need to fallow the chain

    public ConstructorDemo(String name, String lastname,int hours, double payTime) {
        this(name, lastname);
      //  this(); cannot call more than one constructor inside another

     //  this(name, salary);CE
       // this.name = name;
      //  this.salary = salary;
        this.age = 10;
        this.hours = hours;
        this.payTime = payTime;
    }

    public ConstructorDemo(String name, String lastname) {
       // this(name,lastname); cant call same constructor inside another
     //  this(name,lastname,hours,payTime); not in sequence
         this(name);
        //this.name = name;
        this.lastname = lastname;
        System.out.println("two parameters "+name+" "+lastname);
    }

    public ConstructorDemo(String name) {
         this();//should always be first line
        this.name = name;
        System.out.println("with one parameter "+name);
    }

    public ConstructorDemo() {

        System.out.println("important constructor without parameters");

    }

    public static void main(String[] args) {
        ConstructorDemo constructorDemo=new ConstructorDemo("eli","val");

    }
}
