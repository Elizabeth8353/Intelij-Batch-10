package com.MyNotes.Collections;

import java.util.ArrayList;

public class AddingElements {
    public static void main(String[] args) {
        ArrayList<String> s=new ArrayList<>();
        s.add("SDLC");//this is how we add the elements in our arraylist
        s.add("Manual Testing");//indexes are automatically assigned in the siquence we are adding it, the
        //unlike arrays we explicitly assigning it to the index
        s.add("java");
        s.add("Git");
        s.add("Selenium");
        System.out.println(s.get(2));//get is a return type we can get an element from arraylist

        s.add("TestNG");
        //System.out.println(s.get(6));//RE memory for the element will only be applied if we add it
        System.out.println(s);

        System.out.println("==============Adding to a specific Index========================");

        //s.add(1,"My new Additon at index 1");

        System.out.println("=========After adding an aditional element at a specific index");
      //  System.out.println(s);

        System.out.println("===========to add to separate list======================== ");

        ArrayList<String> e=new ArrayList<>();
        e.add("from list e 1");
        e.add("from list e 2");
       // System.out.println(s.addAll(e));
      // System.out.println(s);

        System.out.println("========Adding 2nd list at a specific index=========================");
        System.out.println("original list "+s);
        System.out.println(s.addAll(1,e));
        System.out.println("After adding new list from specific index 1 "+s);



    }
}
