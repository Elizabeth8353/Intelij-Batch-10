package com.MyNotes.Collections;

import java.util.ArrayList;

public class Itrator {
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<>();
        a.add("sdlc");
        a.add("Manual testing");
        a.add("Javafn");
        a.add("git");
        a.add("sel");
        a.add("tes");

//list is dinamic in size when we loop and remove
        for (String arr:a) {//CE we have fewer elements then the number of iterations
            if(arr.length()>4){
                a.remove(arr);
            }
            System.out.println(arr);
        }

    }
}
