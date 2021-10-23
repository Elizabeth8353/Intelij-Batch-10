package com.MyNotes.Collections;

import java.util.ArrayList;

public class Contains {
    public static void main(String[] args) {
//by using arraylist we don't need to loop to find if an element is present in arraylist method Contains
        //will get true or false
        ArrayList<String> i = new ArrayList<>();
        i.add("Hey");
        i.add("papi");
        i.add("dido");
        i.add("pop");
        i.add("bla");
        i.add("bla");
        System.out.println(i.contains("papi"));

        System.out.println("=============contains All+=====================");
ArrayList<String>all=new ArrayList<>();
all.add("papi");
//all.add("blah"); contains all will be false because we have bla not blah
all.add("pop");

        System.out.println(i.containsAll(all));

    }
}
