package com.MyNotes.Overloading;

public class OverloadingDemo {

    public static void main(String[] args) {


        String name = "yulia is a good sudent yulia does her homework on time";

        System.out.println(name.indexOf("yulia"));
        System.out.println(name.indexOf("yulia",name.indexOf("yulia")+1));//Overloading indexOf
        System.out.println(name.indexOf("yulia",10));//hardcoding
    }
}
