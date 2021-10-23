package com.syntax.class30;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class KeyOnlyMap {
    public static void main(String[] args) {
        HashMap<String,Double> grocery=new LinkedHashMap<>();
        grocery.put("egg",5.5);
        grocery.put("rice",4.5);
        grocery.put("milk",6.5);
        grocery.put("tomato",6.5);
        Set<String > mapKeys=grocery.keySet();
        for(String key:mapKeys){
            System.out.println(key);
        }
    }
}
