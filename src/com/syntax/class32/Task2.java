package com.syntax.class32;

import com.MyNotes.Collections.Itrator;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task2 {
    /* Create a map of countries with its capital that will store countries in alphabetical order.

Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.
     */
    public static void main(String[] args) {
        //we don't use the simple for loop because map does not store it by index
        //if you will be modifying the size do not use loops but itrator
        //when dealing with objects because the reference variable contains the address to original obj it will affect original obj
        TreeMap<String,String>country=new TreeMap<>();
        country.put("Usa","WashingtonDC");
        country.put("Ukrain","Kyiv");
        country.put("Italy","Rome");
        country.put("Costa Rica","San Jose");
        country.put("Argentina","Buenos Aires");
        country.put("Colombia","Bogota");


        country.keySet();//method that return us a set keys are always unique which is why we need a set
        country.values();// returna a collection
        country.entrySet();//returns us a map entry holds two values at the same time it's a child interface inside the map interface key/value inside same obj
        //entryset allows us to retrive key and value at the same time

        System.out.println("===================NOT recomended retreving this way=========================================");
        //we do not use simple for loop because set or maps does not have index
        Set<String> keys=country.keySet();//we are getting the keys separetly
        for (String key:keys) {//disadvantage of this is that
            System.out.println(key+" "+country.get(key));//for each key we are scanning through the entire list to get the value each time not good approche
        }
        System.out.println("========================If we want to get only our keys==================================");
        for (String key:country.keySet()) {//if we are trying to only get keys its ok to do this
            System.out.println(key);//if we will modify the size then best to use is itrator
        }
        System.out.println("================getting values===============================");
        for (String value:country.values()) {
            System.out.println(value);
        }
        System.out.println("===============itrator====================================");
        Iterator<String> its=country.keySet().iterator();
        while (its.hasNext()){
            String k=its.next();
            //if (k.length()>5){
            //    its.remove();
           // }
        }
        System.out.println(country);

        System.out.println("===================Getting both values================================");

        Iterator<Map.Entry<String,String>> it=country.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String,String>next=it.next();
            String key=next.getKey();
            String value=next.getValue();
            System.out.println(key+" "+value);
        }
    }
}
