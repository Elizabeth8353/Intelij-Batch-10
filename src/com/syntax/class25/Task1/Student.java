package com.syntax.class25.Task1;

public class Student {
    void Study(){
        System.out.println("Students study");
    }
    void lengthSchool(){
        System.out.println("Students will be in school for specific time");
    }
}
class SyntaxStudent extends Student{
    @Override
    void Study(){
        System.out.println("Syntax Students study and work");
    }
    @Override
    void lengthSchool(){
        System.out.println("Syntax Students school will be for 6 months");
    }
    void work(){
        System.out.println("Syntax students need to work to be in school");
    }
}
class CollegeStudent extends Student{
    @Override
    void Study(){
        System.out.println("College Students study full time");
    }
    @Override
    void lengthSchool(){
        System.out.println("College Students will be there for 4 yrs");
    }
    void party(){
        System.out.println("College students can party while in school");
    }
}
class SchoolStudent extends Student{
    @Override
    void Study(){
        System.out.println("School students study doing homework ");
    }
    @Override
    void lengthSchool(){
        System.out.println("School Students will be there for 8 yrs");
    }
    void graduate(){
        System.out.println("School Students graduate after High school");
    }
}
