package com.syntax.class31;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListRecap {
    public static void main(String[] args) {
        List<String> grocery=new ArrayList<>();
        grocery.add("Milk");
        grocery.add("Cheese");
        grocery.add("Eggs");
        grocery.add("Butter");
        System.out.println("=========================for enhanced=============================================");
        for (String gros:grocery) {
            System.out.println(gros);
        }
        System.out.println("========================Iterator==================================");
        Iterator<String>iterator=grocery.iterator();
        while (iterator.hasNext()){
            String next=iterator.next();
            System.out.println(next);
        }
        System.out.println("========================for loop==============================");
        for (int i = 0; i <grocery.size() ; i++) {
            System.out.println(grocery.get(i));
        }
    }
}
