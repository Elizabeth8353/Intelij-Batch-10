package com.syntax.class30;

import java.util.*;

public class MapDemo1 {
    public static void main(String[] args) {
//If we have a requirement that we need to add more then one value link to another we can use MAPS
        //array list only allows us to enter 1 value per index
        //fastest for retrival is hashmap but insertion order is not mantained
        //linkmap is slower because it mantains order and then does retreval
        //tree map is the slowest for retreaval because it rearanges elements in assending order then does retreval

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Oxana");
        arrayList.add("Mars");
        arrayList.add("Olena");
        arrayList.add("Sharif");
        arrayList.add("Hamza");

//Maps           Key/value          Hashmap, link Hashmap, treeMap implements our Map interface
        Map<Integer,String> map=new HashMap<>();
        map.put(111,"Ehsan");//adds elements to our maplist
        map.put(222,"Maria");
        map.put(333,"Olena");
        map.put(444,"sharif");
        map.put(555,"Jamalodin");
        map.put(666,"Michael");
        map.put(777,"Maria");//we can have duplicate values
        map.put(111,"Eli");//no duplicate keys are allowed so Eli will override the previoouse value and when we print all other values
        //with same key all will show Eli with the last value
        //If some employee leaves the company the new emp assigned that id will override the previuose employee
        System.out.println(map.get(444));//gets the key value of the map
        System.out.println(map.get(222));
        System.out.println(map);//Hashmap does not mantain the insertion Order

        //we can assign meaningfull information as key value pairs
        //fast at when searching data


    }
}
