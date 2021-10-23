package com.syntax.class29.ArrayDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAdd {
    public static void main(String[] args) {
        List <String> list=new ArrayList<>();
        list.add("Michael");
        list.add("Andrei");
        list.add("sule");
        list.add("Abdul");
//add method starts at 0 index
        System.out.println("=======adding two lists=================================");
        List <String> list2=new ArrayList<>();
        list2.add("Elizabeth");
        list2.add("Brianna");
        //list.addAll(list2); adding 2lists
        System.out.println(list);
        System.out.println("==================Add 2nd list at a specified index============================");
        //list.addAll(1,list2);
        //System.out.println(list);
        System.out.println("==================Add only one element from the 2nd list================================");
        list.add(0, list2.get(0));
        System.out.println(list);
    }
}
