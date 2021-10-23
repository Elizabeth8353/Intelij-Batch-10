package com.syntax.class30;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LoopMap {
    public static void main(String[] args) {
        HashMap<String,Double> elec=new LinkedHashMap<>();
        elec.put("Television",10.0);
        elec.put("Remote",3.9);
        elec.put("dryer",5.5);
        elec.put("induction",6.5);
        Set<Map.Entry<String,Double>> entrySet=elec.entrySet();//we are storing our enlec entries in Set since we need itrator and itrator
        //available in set

        for (Map.Entry<String,Double>entry:entrySet) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}
