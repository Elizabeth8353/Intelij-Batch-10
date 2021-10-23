package com.MyNotes.Collections;

import java.util.ArrayList;

public class GetMethod {
    public static void main(String[] args) {
        ArrayList<String>b=new ArrayList<>();
        b.add("hi");
        System.out.println(b.size());//size is like length count ass human but list stores starting at 0 index
        b.add("Hello");
        b.add("miss");
        b.add("you");
        b.add("jiji");
        System.out.println(b.get(0));//get is a return type we can get an element from arraylist by specifing the index
    }
}
