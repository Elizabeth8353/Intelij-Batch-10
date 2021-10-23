package com.syntax.class16;

public class Task4 {
    public static void main(String[] args) {
        //6. How would you check if String is palindrome or not?
        String str="aba";
        String reversed=new StringBuilder(str).reverse().toString();//we
        if(str.equals((reversed))){
            System.out.println("palidrome");
        }else {
            System.out.println("not palidrome");
        }

    }
}
