package com.syntax.class29.ArrayDemo;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Double> numbers=new ArrayList<Double>();
        numbers.add(10.2);
      //  numbers.add(10); implicit casting is not an option in wrapper class /no auto conversion from int to double
        numbers.add(12.0);
        numbers.add(135.0);
        System.out.println(numbers.size());
        System.out.println(numbers);
        numbers.set(1,120.0);//replaces
        //numbers.remove(2);
       // numbers.remove(135.0);//line 15 and 16 is method overloading
        System.out.println(numbers);
        //If we want to update our element values we need For i loop
        for (int i = 0; i <numbers.size() ; i++) {
            numbers.set(i,numbers.get(i)*2);
        }
        System.out.println(numbers);

    }
}
