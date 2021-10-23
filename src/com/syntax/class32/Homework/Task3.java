package com.syntax.class32.Homework;


import java.util.ArrayList;

public class Task3 {
    /*Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers
     */
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(10);
        int sum=0;
        for (Integer arr:arrayList) {
            sum+=arr;
        }
        System.out.println(sum);
    }
}
