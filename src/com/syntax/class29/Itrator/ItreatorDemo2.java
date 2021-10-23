package com.syntax.class29.Itrator;

import java.util.ArrayList;
import java.util.Iterator;

public class ItreatorDemo2 {
    public static void main(String[] args) {
        ArrayList<String> subjects=new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Java");
        subjects.add("Git");
        subjects.add("Selenium");
        subjects.add("TestNG");
        System.out.println(subjects);

        Iterator<String> iterator=subjects.iterator();
        while (iterator.hasNext()){
            String subject=iterator.next();
            if(subject.length()>4){
                iterator.remove();
            }
        }
        System.out.println(subjects);
    }
}
