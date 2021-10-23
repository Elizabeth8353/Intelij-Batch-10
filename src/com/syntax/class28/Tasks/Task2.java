package com.syntax.class28.Tasks;

import java.util.ArrayList;

public class Task2 {
    /*Create an ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that
     */
    public static void main(String[] args) {
        ArrayList <String> name=new ArrayList<>();
        name.add("MArs");
        name.add("Andrei");
        name.add("Hilal");
        name.add("Abdul");
        name.add("Oxana");
        System.out.println(name);
        System.out.println(name.isEmpty());
        System.out.println(name.contains("Abdul"));
        System.out.println(name.size());
    }


}
