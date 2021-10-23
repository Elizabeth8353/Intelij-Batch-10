package com.syntax.class28.Encapsulation;

public class PersonTester {
    public static void main(String[]args){
        Person person=new Person();
        person.setName("ELi");
        System.out.println(person.getName());
        person.setAge(12);
        person.setSSN("123456789");
        System.out.println(person.getAge("123456789"));
        System.out.println(person.getSSN("12345"));


    }
}
