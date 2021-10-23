package com.Review.class10;

public class Student {
    String name;//constructor helps us share and initialize this one variable so we can use it though out our class
    String course;

    Student(String name, String course){
        this.name=name;
        this.course=course;

    }
    void getCourseInfo(){
        System.out.println(name+"Student is learning "+course);
    }
}
class Selenium extends Student{

    Selenium(String name, String course) {
        super(name, course);
    }
    void getCourseInfo(){

    }
}
