package com.syntax.class29.Sets;

import java.util.HashSet;

public class HashSets {
    public static void main(String[] args) {
        //NO DUPLICATE ELEMENTS
        //NO ORDER GARANTEE
        //ALLOWS NULL ELEMENTS
        //MOST WIDELY USED
        //FASTES if you care about speed and not order
        HashSet<String> fruits=new HashSet<>();
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("kiwi");
        fruits.add("apple");
        fruits.add("apple");
        System.out.println(fruits);

    }
}
