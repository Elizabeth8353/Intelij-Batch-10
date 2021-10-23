package com.MyNotes.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class AddFromLoop {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<>();
        for (int i = 0; i <50 ; i++) {
            if(i%2==0){
                num.add(i);
            }
        }
        System.out.println(num);

        //remore if divisible by 5
        System.out.println("================remove divisible of 5=====================");
        Iterator<Integer> iterator=num.iterator();
        while (iterator.hasNext()){
            Integer number=iterator.next();
            if(number%5==0){
                iterator.remove();
            }
        }
        System.out.println(num);
    }
}
