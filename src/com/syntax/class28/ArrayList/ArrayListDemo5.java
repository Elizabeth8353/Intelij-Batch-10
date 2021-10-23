package com.syntax.class28.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo5 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Michael");
        list.add("Adrei");
        list.add("Sule");
        list.add("Abdule");
        System.out.println(list);

        for (String name:list) {
            System.out.print(name+" ");
        }
        System.out.println();
        System.out.println("=====================================");

        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }


    }
}
