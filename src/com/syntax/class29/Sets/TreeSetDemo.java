package com.syntax.class29.Sets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        //NO DUPLICATES
        //All ELements are sorted base on order
        Set<String> letters=new TreeSet<>();
        letters.add("null");
        letters.add("B");
        letters.add("A");
        letters.add("E");
        letters.add("D");
        System.out.println(letters);
    }
}
