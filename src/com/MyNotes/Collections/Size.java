package com.MyNotes.Collections;

import java.util.ArrayList;

public class Size {
    public static void main(String[] args) {
        //size is like length but for collection we use size it counts like human starting 1 but list stores it starting index 0
        ArrayList<String>s=new ArrayList<>();
        s.add("mom");
        System.out.println(s.size());//size returns int indexes are automatically assigned in order you place add
        s.add("chibi");
        System.out.println(s.size());//unlike arrays we need to assign value to each index
        s.add("Brianna");
        System.out.println(s.size());
        s.add("Dad");
        s.add("elizabeth");
    }
}
