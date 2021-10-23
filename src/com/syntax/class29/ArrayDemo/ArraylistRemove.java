package com.syntax.class29.ArrayDemo;

import java.util.ArrayList;
import java.util.List;

public class ArraylistRemove {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Michael");
        list.add("Andrei");
        list.add("sule");
        list.add("Abdul");
        list.add("Andrei");
       // list.remove(0);removing by index
       // list.remove("Andrei");only removes first andrei
        System.out.println(list);
        System.out.println("==============remove all the Andrei============================");
        List <String> list2=new ArrayList<>();
        list2.add("Andrei");
       // list.removeAll(list2); removes all Andrei
      //  System.out.println(list);
        System.out.println("===================removing using loop==============");
        while (list.remove("Andrei")){
        }//looping through our list and removing all Andrei
        System.out.println(list);

    }
}
