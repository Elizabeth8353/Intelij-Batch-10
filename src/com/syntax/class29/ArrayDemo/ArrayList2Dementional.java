package com.syntax.class29.ArrayDemo;

import java.util.ArrayList;

public class ArrayList2Dementional {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> arrayList=new ArrayList<>();//big container that holds multiple array lists
        ArrayList<String> arrayList1=new ArrayList<>();
        arrayList1.add("Hello");
        arrayList.add(arrayList1);

    }
}
