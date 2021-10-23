package com.syntax.class31.Homework;

import com.MyNotes.Collections.Itrator;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        TreeMap <String,String> country=new TreeMap<>();
        country.put("Usa","Washington DC");
        country.put("Ukraine","Kyiv");
        country.put("Costa Rica","San Jose");
        country.put("Argentina","Buenos Aires");
        country.put("Colombia","Bogota");
        country.put("Mexico","Mexico City");
        country.put("New Zeland","Wellington");

        Set<String>keys=country.keySet();//keys only since set does not hold duplicates
        Collection<String>values=country.values();//since we can have duplicate values

       // country.entrySet();//returns map.entry if we want key and value since sets and collection can't hold two obj
        Iterator<Map.Entry<String,String>> itrator1=country.entrySet().iterator();
        while (itrator1.hasNext()){

        }



           }
}
