package com.syntax.class30;

import java.util.HashMap;

public class ReplaceMethod {
    public static void main(String[] args) {
        HashMap<String,Double> groceries=new HashMap<>();
        groceries.put("Egg",12.0);
        groceries.put("tomato",5.5);
        groceries.put("milk",2.5);
        groceries.put("potato",4.2);
        groceries.put("steak",3.5);
        System.out.println(groceries);
        groceries.put("shirt",null);
        groceries.put(null,5.0);
        groceries.put("orange",null);
        groceries.replace("milk",5.5);//will replace line 10 value / keys are not change only data stored in key
        System.out.println(groceries);

    }
}
