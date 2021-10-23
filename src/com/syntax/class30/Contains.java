package com.syntax.class30;

import java.util.HashMap;

public class Contains {
    public static void main(String[] args) {
        HashMap<String,Double> groceries=new HashMap<>();
        groceries.put("Egg",12.0);
        groceries.put("tomato",5.5);
        groceries.put("milk",2.5);
        groceries.put("potato",4.2);
        groceries.put("steak",3.5);
        groceries.put("shirt",null);
        groceries.put(null,5.0);
        groceries.put("orange",null);

        System.out.println(groceries);
        System.out.println(groceries.containsKey("Potato"));


    }
}
