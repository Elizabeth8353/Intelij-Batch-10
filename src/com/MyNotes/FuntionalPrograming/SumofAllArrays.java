package com.MyNotes.FuntionalPrograming;

import java.util.Arrays;
import java.util.Locale;


public class SumofAllArrays {
    public static void main(String[] args) {
        int[] Arr={2,5,6,8,10};
        System.out.println(Arrays.stream(Arr).sum());// sum all elements in Array
        String str="hello";
        String s="";
        for(int i=0;i<str.length();i++){
            s+=str.charAt(i);
            s=s.toUpperCase();
        }
        System.out.println(s);

        }
    }

