package com.syntax.class28;

public class c {

    public static void main(String[] args) {

        int[] arr={10,20,5,2,5};
        int counter=0;
        int[] newArr=new int[counter];
        for (int i = 0; i <arr.length ; i++) {

            if(arr[i]==5){
                continue;
            }
           // counter++;
            newArr[counter]+=arr[i];
            counter++;
            System.out.println(arr[i]);
        }
        System.out.println(counter);
    }
}
