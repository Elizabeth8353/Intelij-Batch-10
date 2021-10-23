package com.syntax.class30;

import java.util.*;

public class ItratorMap {
    public static void main(String[] args) {
        HashMap<Double,String> employeeTable=new LinkedHashMap<>();
        employeeTable.put(1.0,"Kevin");
        employeeTable.put(2.0,"Michael");
        employeeTable.put(3.0,"Sule");
        employeeTable.put(4.0,"Olena");
        employeeTable.put(5.0,"Noor");
        System.out.println(employeeTable);

        Set<Double> MapKey= employeeTable.keySet();
        Iterator<Double>iterator=MapKey.iterator();
        while (iterator.hasNext()){
            Double key=iterator.next();
            System.out.println(key);
        }
    }
}
