package com.syntax.class29.ArrayDemo;

import java.util.ArrayList;

public class ArrayListContainsAll {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Night");
        words.add("Day");
        words.add("Sun");
        words.add("Moon");

        ArrayList<String> otherWords=new ArrayList<>();
        otherWords.add("Day");
        otherWords.add("Moon");

        System.out.println(words.contains(otherWords));
    }
}
