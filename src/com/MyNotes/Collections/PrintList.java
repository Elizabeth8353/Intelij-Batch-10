package com.MyNotes.Collections;

import java.util.ArrayList;

public class PrintList {
    public static void main(String[] args) {
        ArrayList<Integer>i=new ArrayList<>();
        i.add(5);
        i.add(4);
        i.add(3);
        i.add(2);
        i.add(1);
        i.add(0);
        System.out.println(i);
        System.out.println("=========================Using Loop====================================");
        for (Integer num:i) {
            System.out.println(num);
        }

    }
}
