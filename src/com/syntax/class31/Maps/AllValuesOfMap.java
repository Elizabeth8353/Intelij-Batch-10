package com.syntax.class31.Maps;

import java.util.*;

public class AllValuesOfMap {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(101,"Oxana");
        map.put(102,"Oxana");
        map.put(202,"Jane");
        map.put(90,"Mike");
        map.put(null,"Abdul");
        //since map is not part of collections if we want to get all the entry objects we need Set(keys) since keys cannot be duplicate
        //to store  our values list(values) since duplicates are allowed we need to call Collection to not specify witch list
        System.out.println("==============Get values=================================");
        Collection<String> val=map.values();
        for(String str:val){
            System.out.println(str);
        }
        System.out.println("===========================Iterator======================================================");
        Iterator<String> iterator=val.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("===========================GetKeys&Value==============================================");

        Set<Integer>keys=map.keySet();
        for(Integer key:keys){//if we use int it will still work we would be unboxing
            System.out.println(key+" "+map.get(key));//only difference is that we would not have access to the methods of obj
        }
        System.out.println("=========Iterator keys&Value============================================");

        Iterator<Integer> iter= keys.iterator();
        while (iter.hasNext()){
            Integer i=iter.next();
            System.out.println(i+"-"+map.get(i));
           // System.out.println(iter.next()+""+map.get(iter.next()));wrong way because 101-oxana will move twice every iteration 202-mike
        }

    }
}
