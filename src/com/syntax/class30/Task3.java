package com.syntax.class30;

import java.util.TreeMap;

public class Task3 {
    public static void main(String[] args) {
        //tree map always stores data and then prints
        TreeMap<Integer,String> building=new TreeMap<>();
        building.put(1,"Facebook");
        building.put(2,"Google");
        building.put(3,"Netflix");
        building.put(4,"Amazon");
        building.put(5,"Google");
        building.put(6,"Apple");
        building.put(7,"IBM");
        building.put(1,"Apple");
        System.out.println(building);
        System.out.println(building.size());
        building.replace(4,"adobe");
        building.remove(7);
        System.out.println(building);

    }
}
