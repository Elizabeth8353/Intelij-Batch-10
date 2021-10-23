package com.syntax.class16;

public class Task2 {
    public static void main(String[] args) {
        /*2. Create a String that should be combination of letters, numbers and special characters.
        Find out how many alpha characters are there in the String.
         */
        //To format your code in intellij = Ctrl+alt+l

        String str="kjn;skf&1235*%";
        System.out.println(str.replaceAll("[^A-Za-z0-9]","").length());
//this is called method chaining we call a method and another method it will only show the last method output
    }
}
