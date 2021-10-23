package com.syntax.class25.Task1Class;

public class Student {
    void study(){
        System.out.println("Student must study");
    }
    void doHomework(){
        System.out.println("Student must do homework");
    }
    void practice(){
        System.out.println("Students must practice");
    }
}
class SyntaxStudents extends Student{
    void study(){
        System.out.println("Syntax Student must study hard to get job quick");
    }
    void doHomework(){
        System.out.println("Student must do programing homework");
    }
    void doResearch() {
        System.out.println("Syntax students must do reasearch on google and watch youtube videos");
    }
}
class CollegeStudent extends Student{
    void doHomework(){
        System.out.println("College Student must do homework to get good grades");
    }
}
class SchoolStudent extends Student{

}

