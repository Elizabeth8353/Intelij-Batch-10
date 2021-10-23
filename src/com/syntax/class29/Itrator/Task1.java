package com.syntax.class29.Itrator;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
    //Create an arraylist of cars and retrieve all the values using 3 different ways.
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<>();
        cars.add("BMW");
        cars.add("Honda");
        cars.add("Toyota");
        cars.add("Hyundai tucson");
        cars.add("Lucid");

        //one way retreiving
        for (String car:cars) {//when exesing only elements best to use for each loop
            System.out.println(car);
        }
        //2nd way
        for (int i = 0; i <cars.size() ; i++) {
            System.out.println(cars.get(i));
        }

        //3rd way
        Iterator<String> iterator=cars.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
