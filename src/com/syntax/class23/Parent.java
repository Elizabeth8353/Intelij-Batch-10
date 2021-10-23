package com.syntax.class23;

public class Parent {
    String name = "akbulut";

    void printName() {
        System.out.println("Name is " + name);
    }

    void getMarried() {
        System.out.println("My children will get married by my choice");
    }
}
    class Child extends Parent{
        String name="Enes";
        void printName(){
            String name="Testaf";
            System.out.println("Name is "+name);
            System.out.println("Name is "+this.name);
            System.out.println("Name is "+super.name);
        }
        void getMarried(){
            System.out.println("But I like someone else");
        }
        void letsDoSomethingCrazy(){
            this.getMarried();
            super.getMarried();
            getMarried();//we can have methods and fields on the second line as well
        }
    }

