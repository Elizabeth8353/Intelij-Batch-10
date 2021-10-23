package com.MyNotes.Collections;

public class BoxingAndUnboxing {
    public static void main(String[] args) {
        //in collection framework they can't use primitive So they created Wrapper Classes this mechanisim allows them to them as objects
        // Another problem was that what if we want to use the primitive and Object so they provided a mechanisim to convert primitive to OBJ
        //and viseversa. Another issue the saw was that the convertion code was long so they created AutoBoxing and Unboxing


        //BOxing is converting primitive to its corresponding wrapper class
        //unBoxing
        Integer A=new Integer(10);//this is BOXING we are placing primitive int to  integer wrapper class
        //We can do same in shorter way AutoBoxing

        Integer A1=20;

        //to convert obj back into its original primitive datatype

        int a=A.intValue();//returns value of the obj to int This is UNBOXING
        //shorter way
        int a1=A1;




    }
}
