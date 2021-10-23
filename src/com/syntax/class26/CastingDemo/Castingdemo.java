package com.syntax.class26.CastingDemo;

import java.util.Objects;

public class Castingdemo {
    public static void main(String[] args) {
        Object[] obj={"Hi",22,'A'}; //parent to all the classes in java
        int c=(int)obj[1];//downcasting 22 back to int from object parent class
        System.out.println(c);
        String b=((String)obj[0]).toString();// casting down to String
        System.out.println(b);
        System.out.println(b.length());

        System.out.println("===================================================================");
        for(Object o:obj){
            if(o instanceof String){//checks if obj is
                System.out.println(((String) o).length());
            }
        }
    }
}
