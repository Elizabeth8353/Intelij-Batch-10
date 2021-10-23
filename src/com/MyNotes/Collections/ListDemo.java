package com.MyNotes.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    //is the parent of arraylist and link list which is why we can store arraylist and linklist under parent list Class
    //and because of polimorphysim we are are to do so List is an interface and Arraylist can
    //if you are planing to store data in between use linklist instead of arraylist
    //if you are need to retrive/ find info fast then use Array or planning to store data in the end
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();//this is stored based on index in sequence retreval is fast but if we move
        //anything from in between then we will have to shift all the other elements will have to be rearange and it could be disasterous
        arr.add("hi");
        arr.add("hey");
        arr.add("bye");

        List<String> link= new LinkedList<>();//retreval is slow because we have to go through each element to find out the address for the element
        //only pointers are change we do not have to reshift any element or move the physical data in the memory like in ArrayList
        // link list stores its data
        link.add("hello");
        link.add("Good Bye");

        System.out.println(arr.addAll(link));//we can all both list as one because same data type and under list
        System.out.println(arr);

        //It's important to use the right data structure it could be critical to the application like software that run on airlines
        //datastructures and how efficiently you are using the harware is important
        //arraylist is not sincronized

        //if we are using collection to access the data most of the time we should use arraylist because arraylist uses arrays under the hoop
        // and the read acess is very fast with arrays

        //if we require to insert data in the front or middle and elements need to be shifted then link list is best to use because arraylist
        //would be very slow to rearange elements



    }
}
