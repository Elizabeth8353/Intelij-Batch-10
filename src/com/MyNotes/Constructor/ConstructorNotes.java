package com.MyNotes.Constructor;

public class ConstructorNotes {
    //cant use non acess modifiers with constructors
    String name;
    int grade;
    int age;

    private  ConstructorNotes(String name, int grade, int age) {//age is gray because since we are won't
        this.name = name;//we use this keyword when their is a conflict between local and instance variable
        this.grade = grade;//if we didn't use this local will be prefered and will
        this.age = 20;//once we assign a value we won't take the local var value from our line 20
    }
    void printInfo(){
        System.out.println(name+" "+grade+" "+age);
    }

    public static void main(String[] args) {
        ConstructorNotes classPractice=new ConstructorNotes("eli",80,25);
        classPractice.printInfo();
    }
}
