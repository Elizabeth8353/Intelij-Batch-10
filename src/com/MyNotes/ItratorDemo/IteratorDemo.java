package com.MyNotes.ItratorDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> subjects=new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");

        System.out.println(subjects);
//itrator gets a copy of our list is created
// if we use the remove() both list and iterator are affected if we call hasNext() and next() only itrator is affected
        Iterator<String>iterator=subjects.iterator();//iterator method() is returning an object of this Iterator interface
        //iterator has 3 methods (hasNext,next,remove)itrator gives us a copy of our list
        System.out.println(iterator.hasNext());//true still elements in our list
        System.out.println(iterator.next());//SDLC moved the pointer to first element
        iterator.remove();//will delete where pointer is currently pointing SDLC
        System.out.println(subjects);//Manual Testing
        System.out.println(iterator.hasNext());//currently in deleted SDLC
        System.out.println(iterator.next());//now pointer pointing at Manual testing
        System.out.println(subjects);//Manual testing
        System.out.println(iterator.hasNext());//false because nothing after Manual testing

        iterator=subjects.iterator();//calling it again
        System.out.println(subjects);//only manual testing
        System.out.println(iterator.hasNext());//now it's true because pointer pointing at -1 not on list yet
        System.out.println(iterator.next());//now pointer on first element Manual testing
        System.out.println(iterator.hasNext());//no elements after Manual testing




    }
}
