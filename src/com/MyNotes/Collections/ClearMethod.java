package com.MyNotes.Collections;

import java.util.ArrayList;

public class ClearMethod {
    public static void main(String[] args) {
        //if you want to keep that arraylist but want to remove the elements in that array we can use clear

        ArrayList<String> i = new ArrayList<>();
        i.add("Hey");
        i.add("papi");
        i.add("dido");
        i.add("pop");
        i.add("bla");
        i.add("bla");
        System.out.println("Array before being cleared "+i+" "+i.size());
        i.clear();
        System.out.println("Array After clearing "+i+" "+i.size());


    }
}
