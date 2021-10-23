package com.syntax.class29.Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashsetDemo {
    //NO DUPLICATES
    //ORDER MANTAINED
    //SLOWER THEN HASHSET
    //IF YOU CARE ABOUT ORDER AND NOT SPEED
    public static void main(String[] args) {
        LinkedHashSet<String> fruits=new LinkedHashSet<>();
        fruits.add("null");
        fruits.add("mango");
        fruits.add("kiwi");
        fruits.add("apple");
        fruits.add("apple");
        System.out.println(fruits);
    }
}
