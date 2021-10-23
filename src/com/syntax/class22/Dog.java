package com.syntax.class22;

public class Dog extends Animal{
    int noOfLeg=4;

    @Override
    void eat() {
        System.out.println("Dog like to eat meat");
    }
    void activities(){
        sleep();
        eat();
        super.eat();//method from parent class
    }
    void sleep(){
        System.out.println("Dog can sleep");
    }
    void printLeg(){
        System.out.println(noOfLeg);//dog var
        System.out.println(super.noOfLeg);//parent var
    }

    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.printLeg();
        dog.activities();
    }
}
