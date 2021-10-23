package com.syntax.MyNotes;

public class InstanceOfMethod {
    void method1(){
        System.out.println("I am Parent method");
    }
}

class Child1 extends InstanceOfMethod{
    @Override
    void method1(){
        System.out.println("Child 1 method 1 overriding ");
    }
    void method2(){
        System.out.println("Child 1 method 2 ");
    }
}

class Child2 extends InstanceOfMethod{
    @Override
    void method1(){
        System.out.println("Child 2 method 1 overriding");
    }
    void method3(){
        System.out.println("Child2 method 3 ");
    }
}

class Tester {
    public static void main(String[] args) {
        InstanceOfMethod[] arr={new Child1(),new Child2()};//array of our objs in our parent class
        for(InstanceOfMethod a:arr){
           // a.method1(); will show parent method1 from child1 and child 1 overriding
            if(a instanceof Child1 ){//we are downcasting from parent to child class
                ((Child1)a).method2();// to access child 1 own method 2
            }else if(a instanceof Child2){
                ((Child2)a).method3();
            }
            a.method1();
        }
    }
}
