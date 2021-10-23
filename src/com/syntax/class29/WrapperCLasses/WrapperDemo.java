package com.syntax.class29.WrapperCLasses;

public class WrapperDemo {
    public static void main(String[] args) {
        String name="Hello";
        String name2= new String("HEllo");

        Integer number=new Integer(10);//Boxing assigning primitive to proper wrapper class
        Integer number2=20;//AutoBoxing shorter syntax to Boxing
        String str=number.toString(); // converting Integer to String

        int num=number.intValue();//unboxing process of assingning obj to its proper primitive type
        int num2=number2;//Autoboxing





    }
}
