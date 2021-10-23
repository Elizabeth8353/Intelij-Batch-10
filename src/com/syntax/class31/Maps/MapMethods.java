package com.syntax.class31.Maps;

import java.util.Map;
import java.util.TreeMap;

public class MapMethods {
    public static void main(String[] args) {
        Map<Integer,String> tmap=new TreeMap<>();
        tmap.put(101,"oxana");
        tmap.put(202,"Oxana");
        tmap.put(177,"null");
        tmap.put(90,"Mike");
        tmap.put(90,"Abdul");

        //acessing one value
        System.out.println(tmap.get(90));
        //since map is not part of collections if we want to get all the entry objects we need Set(keys) since keys cannot be duplicate
        //to store  our values list(values) since duplicates are allowed we need to call Collection to not specify witch list



    }
}
