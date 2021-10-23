package com.syntax.class25;

public class Person {
    String name;
    Person(String name){
        this.name=name;
    }
    void eat(){
        System.out.println("Person can eat");
    }
    void performDailyActivities(){
        System.out.println("Eat sleep repeat");
    }
}
class Employee extends Person{
    Employee(String name) {
        super(name);
    }

    @Override
    void performDailyActivities(){
        System.out.println("Office work all the day and emails at night");
    }
}
class Student extends Person{
    Student(String name) {
        super(name);
    }
@Override
    void performDailyActivities(){
        System.out.println("Attend classes and practice at night");
    }
}
class Teacher extends Person{
    Teacher(String name) {
        super(name);
    }
@Override
    void performDailyActivities(){
        System.out.println("Teching classes checking assignement");
    }
}
