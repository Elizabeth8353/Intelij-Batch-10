package com.syntax.class30;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapPutMethod {
    public static void main(String[] args) {
        Map<Integer,String> map= new HashMap<>();
        map.put(111,"Brianna");
        map.put(222,"Eli");

        Map<Integer,String> map1=new TreeMap<>();
        map1.put(333,"MamiCharo");
        map1.put(444,"Silvia");

        map.putAll(map1);
        map1.putAll(map);
        System.out.println(map1);

    }
}
