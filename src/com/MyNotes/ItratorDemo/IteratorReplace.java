package com.MyNotes.ItratorDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorReplace {
    public static void main(String[] args) {
        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("fanta");
        drinks.add("voss");
        drinks.add("coco");
        drinks.add("baba");
        drinks.add("sprite");
        drinks.add(0,"eli");//it adds eli to index 0 but what was on index 0 moves to index 1
        drinks.set(0,"new");//set takes index and replaces with new element so eli will be replaced with new
        System.out.println(drinks);
      Iterator<String> iterator=drinks.iterator();
       while (iterator.hasNext()){
            String drink=iterator.next();
            if(drink.contains("a")||drink.contains("e")){
                drinks.set(drinks.indexOf(drink),"water");//cannot use replace since strings are imutable
           }
       }
        System.out.println(drinks);

        System.out.println("===================with for Each loop========================================");

        for (String d:drinks) {
            if(d.contains("e")||d.contains("a")){
                drinks.set(drinks.indexOf(d),"water");
            }
        }
        System.out.println(drinks);

        System.out.println("======================for Loop============================");
        for (int i = 0; i <drinks.size() ; i++) {
            if(drinks.get(i).contains("e")||drinks.get(i).contains("a")){
                drinks.set(i,"water");
            }
        }
        System.out.println(drinks);
    }
}
