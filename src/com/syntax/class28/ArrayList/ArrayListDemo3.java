package com.syntax.class28.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        //its dinamic so size will be adjusted automatically
        //order is mantained
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Hillal");
        arrayList.add("ELi");
        arrayList.add("Jam");
        arrayList.add("ELi");
        arrayList.add("Tes");
        System.out.println(arrayList);
        arrayList.remove("Hillal");//method will remove and shift all the other elements
        System.out.println(arrayList);
        arrayList.add(2,"Serge");//inserting element at specific index
        System.out.println(arrayList);

    }
}
