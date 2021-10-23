package com.syntax.class30;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapKeysAndValue {
    //since map is not part of collections we cannot use iterator to iterate though our list we need to
    //store our entry obj in our Collection and Set to use for loop or iterators
    public static void main(String[] args) {
        Map<Integer,String> student=new HashMap<>();
        student.put(1,"Maria");
        student.put(2,"Jamil");
        student.put(3,"sharif");
        student.put(4,"Ana");
        student.put(5,"Olena");
        System.out.println(student);
        System.out.println("==========================");
        Collection<String> values = student.values();//we are using Collection to retrieve our values because value() returns collection
        for(String students:values){
            System.out.println(students );
        }
        Set<Integer> keys=student.keySet();//we are using set because keySet() returns Set
        for (Integer Key:keys){
            System.out.println(Key);
        }
    }
}
