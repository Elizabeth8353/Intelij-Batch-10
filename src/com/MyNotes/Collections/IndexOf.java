package com.MyNotes.Collections;

import java.util.ArrayList;

public class IndexOf {
    public static void main(String[] args) {
        //returns the index in which element is stored
        ArrayList<String> i = new ArrayList<>();
        i.add("Hey");
        i.add("papi");
        i.add("dido");
        i.add("pop");
        i.add("bla");
        i.add("bla");
        System.out.println(i.indexOf("papi"));
    }
}
