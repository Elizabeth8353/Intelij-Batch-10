package com.syntax.class18;

public class PersonTester {
    public static void main(String[] args) {
        Person person = new Person("eli",18,"Boli");
//person.name="jesus";
//person.age=15;
//person.country="usa";
person.printinfo();

Person person1=new Person("nati",12,"japan");
person1.name="Somi";
person1.country="USa";
person1.printinfo();
    }
}
