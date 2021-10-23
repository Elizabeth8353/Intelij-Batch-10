package com.syntax.class28.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("Michael");
        list.add("Andrei");
        list.add("Sule");
        list.add("Abdule");
        System.out.println("==================================================");


        ArrayList<String>list1=new ArrayList<>();
        list1.add("Mars");
        list1.add("Eugene");
        list1.add("Dinaloza");

        System.out.println(list);

        list.addAll(list1);// adding two arrays together
        System.out.println(list);
        list.addAll(1,list1);//to add an array starting at a specific index
        System.out.println(list);
        list.add(list1.get(0));//to only add one element from another array list
        list.add(1,list1.get(0));//adding element from another arraylist to a specific index of our original list

        System.out.println(list.size());//to get length

        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
        for (String name:list) {
            System.out.println(name);
        }


    }
}
