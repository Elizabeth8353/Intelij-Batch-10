package com.syntax.class16;

public class Task3 {
    public static void main(String[] args) {
        //5. How would you reverse a String word by word?
        String str="This is a sentence that i want to reverse";
        String[] arr=str.split(" ");
        System.out.println(arr[2]);
        String rev="";
        for (int i = 0; i <arr.length ; i++) {
            StringBuilder stringBuilder=new StringBuilder(arr[i]);
            stringBuilder.reverse();
            rev=stringBuilder.toString();
        }
        System.out.println(rev);
        System.out.println("=================================================");
        String b="This is my second array";
        String[] arr2=b.split(" ");
        System.out.println(arr2.length);
        StringBuilder reverse1=new StringBuilder();
        for(String s:arr2){
            StringBuilder strb=new StringBuilder(s);
            strb.reverse();
            reverse1.append(strb).append(" ");
        }
        System.out.println(reverse1);
    }
}
