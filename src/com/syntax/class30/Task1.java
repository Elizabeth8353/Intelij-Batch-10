package com.syntax.class30;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<String, Integer> fruits=new HashMap<>();
        fruits.put("kiwi",10);
        fruits.put("Melon",5);
        fruits.put("mango",7);
        fruits.put("peach",9);
        fruits.put("apple",12);
        fruits.put("orange",19);
        System.out.println(fruits);
        System.out.println(fruits.get("peach"));
        System.out.println(fruits.containsKey("mango"));
        System.out.println(fruits.containsKey(29));
        fruits.remove("orange");
        System.out.println(fruits);
        fruits.replace("peach",1);
        System.out.println(fruits);
    }
}
