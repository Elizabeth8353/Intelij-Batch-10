package com.syntax.class28.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayDemo6 {
    public static void main(String[] args) {
        List<String> name=new ArrayList<>();
        name.add("Michael");
        name.add("Andrei");
        name.add("Sule");
        name.add("Abdul");
        name.add("Andrei");
        System.out.println(name);
        System.out.println(name.remove("Andrei"));

        while(name.remove("Andrei")){

        }
        System.out.println(name);

        //for (int i = 0; i <name.size() ; i++) {
          //  if(name.get(i).equals("Andrei")){
            //    name.remove(i);                  works in this scenerio but not reliable or recomended
           // }
      //  }
     //   System.out.println(name);

    }
}
