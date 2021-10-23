package com.syntax.class29.ArrayDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLooping {
    public static void main(String[] args) {
        List <String> list=new ArrayList<>();
        list.add("Michael");
        list.add("Andrei");
        list.add("sule");
        list.add("Abdul");
        System.out.println("=======Enhanced loop========================");
        for (String l:list) {
            System.out.println(l);
        }
        System.out.println("=========Simple loop==============================");
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));



        }


    }
}
