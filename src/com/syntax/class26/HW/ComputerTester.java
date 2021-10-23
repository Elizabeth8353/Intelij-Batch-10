package com.syntax.class26.HW;

public class ComputerTester {
    public static void main(String[] args) {
        Apple apple=new Apple();//Constructor from parent will always
        //execute first even if we don't call it in child class using super keyword
        //java automatically calls parent costructor
        Dell dell=new Dell();
        //Computer[] computers={ apple,dell,new HP(),new Lenovo()};

       // for (Computer computer:computers){
       //     computer.browserInternet();
       //     computer.openFiles();
       // }

    }
}
