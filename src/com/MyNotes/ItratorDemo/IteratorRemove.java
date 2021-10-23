package com.MyNotes.ItratorDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorRemove {
    //remove any word that ends with e
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("wake");
        words.add("live");
        words.add("bob");
        words.add("eli");
        words.add("java");

        Iterator<String> iterator=words.iterator();
        System.out.println(words);
        while (iterator.hasNext()){
            String word=iterator.next();
            if(word.endsWith("e")){
                iterator.remove();
            }
        }
        System.out.println(words);


    }
}
