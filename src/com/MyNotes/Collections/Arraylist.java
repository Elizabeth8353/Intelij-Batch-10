package com.MyNotes.Collections;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        //ArrayList came as a solution to arrays since arrays are fixed in size and we need alot of coding to modify or make changes to an Array
        //but ArrayList is dinamic we can adjust the size by using add method and has many other methods Array does not have all these features
        //and need to make a new array and store the old array in it if any changes needed this is why Array list is better to use when it
        //comes to making adjustments to our values or size. but if you know the size and speed is important use Array
        //if we don't know what size our array will be use ArrayList because we can save in memory and arraylist is dynamic
//arraylist has alot of flexibility you can add elements
        ArrayList<String> i=new ArrayList<>();
        i.add("hi");
        System.out.println(i.size());//size is used instead of length in collection
        i.add("hello");
        i.add("my");
        System.out.println(i.size());//size is dynamic
        i.add("name");
        i.add("is");
        i.add("eli");
        System.out.println("Before remove method "+i.size());
        System.out.println(i.remove(1));
        System.out.println("After remove method "+i.size());




    }
}
