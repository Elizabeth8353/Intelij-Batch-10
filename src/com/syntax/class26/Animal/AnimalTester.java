package com.syntax.class26.Animal;

public class AnimalTester {
    public static void main(String[] args) {
        Animal animal=new Cat();
        animal.eat();

        Animal animal1=new Dog();
        Cat cat=(Cat)animal;// if we try to cast child to another child we will get error
        ((Cat)animal).meow();
        cat.meow();
    }
}
