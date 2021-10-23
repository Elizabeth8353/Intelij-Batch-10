package com.syntax.class31.Maps;

import java.util.*;

public class MapRecap {
    public static void main(String[] args) {
        //Map is a collection of entry objects
        Map<Integer,String> map=new HashMap<>();
        map.put(101,"Oxana");
        map.put(102,"Jhon");
        map.put(202,"Jane");
        map.put(90,"Mike");
        map.put(null,null);
        map.put(null,"Elizabeth");

        System.out.println(map.size());
        System.out.println(map);
        System.out.println(map.isEmpty());
        map.clear();
        System.out.println(map);
        System.out.println(map.isEmpty());
        System.out.println("===============================Linked HashMap========================");
        Map<Integer,String> map1=new LinkedHashMap<>();//preserves the order
        map1.put(101,"Oxana");
        map1.put(102,"Jhon");
        map1.put(202,"Jane");
        map1.put(90,"Mike");
        map1.put(null,null);
        map1.put(null,"Elizabeth");
        System.out.println("Linked HashMap");
        System.out.println(map1);

        System.out.println("===============================TreeMap=====================================");
        Map<Integer,String> map2=new TreeMap<>();//stores in assending order by keys, null keys are not allowed
        map2.put(101,"Oxana");
        map2.put(102,"Jhon");
        map2.put(202,"Jane");
        map2.put(90,"Mike");
        //map2.put(null,null); null pointer exemption
        map2.put(10,"Elizabeth");
        System.out.println(map2);
        System.out.println("===================================HashTable======================================");
        Map<Integer,String> map3=new Hashtable<>();//similar to hashmap but no null keys allowed /thread safe/slower then hashmap
        map3.put(101,"Oxana");
        map3.put(102,"Jhon");
        map3.put(202,"null");//null values allowed but not keys
        map3.put(90,"Mike");
       // map3.put(null,null);null pointer excemption not allowed
        map3.put(20,"Elizabeth");
        System.out.println(map3);






    }
}
