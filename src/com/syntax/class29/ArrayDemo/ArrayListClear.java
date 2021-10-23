package com.syntax.class29.ArrayDemo;

import java.util.ArrayList;

public class ArrayListClear {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Night");
        words.add("Day");
        words.add("Sun");
        words.add("Moon");
        words.clear();
        System.out.println(words);
    }
}
