package com.syntax.class28.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo7 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Michael");
        list.add("Andrei");
        list.add("Sule");
        list.add("Abdul");
        list.add("Andrei");
        System.out.println(list);

        ArrayList<String> list1=new ArrayList<>();
        list1.add("Michael");
        list1.add("Abdule");
        list1.add("Andrei");
       list.removeAll(list1);
      System.out.println(list);
    }
}
