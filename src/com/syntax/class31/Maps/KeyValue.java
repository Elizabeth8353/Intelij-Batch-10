package com.syntax.class31.Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class KeyValue {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(101,"Oxana");
        map.put(102,"Oxana");
        map.put(202,"Jane");
        map.put(90,"Mike");
        map.put(null,"Abdul");

        Set<Map.Entry<Integer,String>> setEntry=map.entrySet();
        for (Map.Entry entry:setEntry) { //we can place after Map.Entry <Integer,String> but not obligatory
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        System.out.println("================================Iterator===================================");
        Iterator<Map.Entry<Integer,String>> it3=setEntry.iterator();
while (it3.hasNext()){
    Map.Entry<Integer,String>e=it3.next();
    System.out.println(e.getKey()+" "+ e.getValue());
}
    }
}
