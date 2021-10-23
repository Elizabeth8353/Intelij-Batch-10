package com.syntax.class28.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        //run time issues not recomended
        // not recomended to store different types of values because can cause runtime issues
        //not reliable and to obtain methods in that class convertion will need to happen
        // best to avoid this
        ArrayList<Object>arrayList=new ArrayList<>();
        arrayList.add(10);
        arrayList.add("jam");

        ArrayList arrayList1=new ArrayList();//we don't have to mention the data type
        arrayList1.add(10);
        arrayList1.add("sdmfbks");
    }
}
