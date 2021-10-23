package com.MyNotes.Collections;

import java.util.ArrayList;

public class RemoveElement {
    public static void main(String[] args) {
        ArrayList<String> i = new ArrayList<>();
        i.add("Hey");
        i.add("papi");
        i.add("dido");
        i.add("pop");
        i.add("bla");
        i.add("bla");
      //  System.out.println("Size before removal "+i.size());
       // System.out.println(i.remove(2));//removes  a single element and shows in console the element you are removing
      //  System.out.println("Size after removal "+i.size());//it automatically shrinks it size after removal
        System.out.println("============To Remove more then one===============");
        ArrayList<String> a= new ArrayList<>();
        a.add("dido");
        a.add("bla");

        System.out.println(i.removeAll(a));
        System.out.println(i);

    }
}
