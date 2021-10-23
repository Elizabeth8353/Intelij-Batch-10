package com.syntax.class30;

import sun.reflect.generics.tree.Tree;

import java.util.*;

public class MapGet {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(111, "Brianna");
        map.put(222, "Eli");
        map.put(333, "mami");
        map.put(444, "papa");
        map.put(555, "chibi");
        System.out.println(map.get(555));//we get the value assigned to that value

    }
}
