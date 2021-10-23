package com.syntax.class29.Itrator;

import java.util.ArrayList;
import java.util.Iterator;

public class ItratorDemo {
    public static void main(String[] args) {
        ArrayList<String> subjects=new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
      //  subjects.add("Java");
      //  subjects.add("Git");
       // subjects.add("Selenium");
      //  subjects.add("TestNG");
        Iterator<String>iterator=subjects.iterator();
        System.out.println(iterator.hasNext());
        System.out.println(iterator.hasNext());//just checks if we have any elements
        System.out.println(iterator.next());//iterates through our elements
        iterator.remove();//we can only use remove method once we have called our next method since we need to locate our element before performing any actions
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
    }
}
