package com.syntax.class28.ArrayList;

import java.util.ArrayList;

public class ArrayDemo8 {
    public static void main(String[] args) {
        ArrayList<String>subjects=new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Java");
        subjects.add("Git");
        subjects.add("Selenium");
        subjects.add("TEstNG");
        subjects.remove(0);
        subjects.remove("Selenium");
//using for loop to remove from our list is not recomended since it's dimamic and changes index position and rearenges when we remove something
        for (String sub:subjects) {
            if(sub.length()>4){
                subjects.remove(sub);
            }
        }

    }
}
