package com.syntax.class29.Itrator;

import java.util.ArrayList;
import java.util.Iterator;

public class Task4 {
    /*
    Create an arrayList of even numbers from 1 to 50.
    Remove any number that is divisible by 5 from that arrayList.
     */
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int i = 2; i <50 ; i+=2) {
            arrayList.add(i);
        }
        System.out.println(arrayList);
        Iterator<Integer> iterator=arrayList.iterator();
        while (iterator.hasNext()){
            if(iterator.next()%5==0){
                iterator.remove();
            }
        }
        System.out.println(arrayList);
    }
}
