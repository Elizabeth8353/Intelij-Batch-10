package com.syntax.class31;

import java.util.*;

public class Sets {
    public static void main(String[] args) {
        //for set we can only do retrive by for enhance loop or iterator no get method
        Set<String>car=new LinkedHashSet<>();
        car.add("BMW");
        car.add("Kia");
        car.add("TOyota");
        car.add("Honda");
        System.out.println(car.size());
        System.out.println(car);
        Iterator<String> it=car.iterator();
        String c=it.next();
        System.out.println(c);
        System.out.println("=======================================================");
        String cc=car.iterator().next();//method chaining new iterator
        System.out.println(cc);
        System.out.println("=======================method chaining==================================");
        List<String> carCopy=new ArrayList<>(car);
        System.out.println(carCopy);
        System.out.println(carCopy.get(2));

        List<String>carCopy2=new ArrayList<>();
        carCopy2.addAll(car);
        System.out.println(carCopy2);
        System.out.println(carCopy2.get(2));

        Set<String>myCar=new LinkedHashSet<>();

    }
}
