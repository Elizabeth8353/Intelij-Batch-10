package com.syntax.class17;

public class StaticDemo {
    String name="blahblah";
    static String country="USA";
    void method1(){
        System.out.println(name);
        System.out.println(country);
    }
    static void method2(){
        //System.out.println(name); name is an instance field
        // vary from obj to obj
       // method1();canot use directly must creat an obj first
        StaticDemo staticDemo=new StaticDemo();
        System.out.println(staticDemo.name);
        staticDemo.method1();
    }

}
