package com.syntax.class29.ArrayDemo;

import java.util.ArrayList;

public class ArrayListContains {
    public static void main(String[] args) {
//tells us if an element is present
        ArrayList<String> words = new ArrayList<>();
        words.add("Night");
        words.add("Day");
        words.add("Sun");
        words.add("Moon");
        System.out.println(words.contains("Sun"));
    }
}
