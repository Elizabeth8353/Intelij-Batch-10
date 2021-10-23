package com.MyNotes.Collections;

import java.util.ArrayList;

public class GeneticVsNonGenetic {
    public static void main(String[] args) {
        ArrayList<String> i = new ArrayList<>();
        i.add("Hey");
        i.add("papi");
        i.add("dido");
        i.add("pop");
        i.add("bla");
        i.add("bla");
       // i.add(10);CE because we are using a Generic String we can only store String best recomended

        ArrayList b=new ArrayList();//this is non generic NOT THE BEST PRACTICE
        b.add("Hello");
        b.add(10);
        b.add(true);

        //this is why non generic is not recomended
        for (Object ob:b) {
          //  ob.length(); CE becuase we are storing a child class in parent class we cannot use child method we are upcasting
            //we will have to downcast syso(((String)ob).lenght());
            //but we cant get length of Int 10 so another problem
        }
    }
}
