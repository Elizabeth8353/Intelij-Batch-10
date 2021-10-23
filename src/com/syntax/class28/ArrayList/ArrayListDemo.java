package com.syntax.class28.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        //class inside collection framework works along with genetics and genetics help our obj behave according to
        //the datatype mentioned
        ArrayList<String>arrayList=new ArrayList<>();//we don't need to specify size like on Arrays
        arrayList.add("10"); //this is how we add values to our arraylist
        arrayList.add("20");//we just need to use name of ref var and addmethod to add elements
        arrayList.add("30");
       // arrayList.add(30); we can only add of same data type
        System.out.println(arrayList);
        System.out.println(arrayList.get(2));//to get the element at specific index
        arrayList.set(1,"200");//replace method--mention index and write element you want to replace with
        System.out.println(arrayList.get(1));

        ArrayList<Integer> arrayList1=new ArrayList<>();
        arrayList1.add(10);


    }
}
