package com.syntax.class20;

public class Teacher {
    /*Write a Java program called Teacher.  Identify features and behaviour of that Class.
    Create 3 subclasses MathTeacher,  ChemistryTeacher and PianoTeacher that would have it their
    own features and behaviour. Test all 4 classes
     */
    String name;
    int age;
    double salary;
    String eats;
    String teaches;
    Teacher(){
         this.name=name;
        this.age=age;
        this.salary=salary;
        this.eats=eats;
    }
    void sleeps(){
        System.out.println(name+" is Sleeping Zzzzzzz");
    }
    void eat(){
        System.out.println(name+ " is eating "+eats);
    }

}
