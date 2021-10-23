package com.syntax.class28.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class RemoveMethod {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("Michael");
        list.add("Andrei");
        list.add("Sule");
        list.add("Abdule");
        list.add("Michael");
        System.out.println(list.remove(1));//to remove one element
        System.out.println(list);

        ArrayList<String>name=new ArrayList<>();
        name.add("Michael");

        list.removeAll(name);//to remove all the Michael

        System.out.println(list);


    }
}
