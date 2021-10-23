package com.syntax.class30;

import java.util.HashMap;
import java.util.Map;

public class MapRemove {
    public static void main(String[] args) {
        Map<Integer,String> map= new HashMap<>();
        map.put(111,"Brianna");
        map.put(222,"Eli");
        map.put(333,"mami");
        map.put(444,"papa");
        map.put(555,"chibi");
        map.remove(333); //removes the key and element in key mami
        map.get(555);
        System.out.println(map);
    }
}
