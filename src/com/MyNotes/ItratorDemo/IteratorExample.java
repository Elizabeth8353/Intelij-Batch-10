package com.MyNotes.ItratorDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("SDLC");
        arr.add("Manual Testing");
        arr.add("Javsncksln");
        arr.add("Java");
        arr.add("TestNG");
        Iterator<String> iterator=arr.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("==========new iterator========================");
       // System.out.println(iterator.next());RunTimeError all elements were used in line 16
       iterator=arr.iterator();//we can only iterate once if we need to itrate again we need this new iterator
        while (iterator.hasNext()){
            if(iterator.next().length()>4){//removing string with characters grater then 4 charactes
                iterator.remove();
            }
        }
        System.out.println(arr);
    }
}
