package com.Practice;

import java.util.Scanner;

public class CreatingNewString {
    public static void main(String[] args) {
        String b="Good by brian";
        String[] arr=b.split("");
        System.out.println(arr.length);
        String n="";
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i].equals("b")){
                n+="("+arr[i]+")";
            }else {
                n+=arr[i];
            }
        }
        System.out.println(n);


    }
}
