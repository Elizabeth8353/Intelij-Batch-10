package com.syntax.class28.IssuesWithArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Issues {
    public static void main(String[] args) {
        int num=10;
        System.out.println(num);
        num=20;//variables can only hold one value at a time/previous value overwritten
        //To solve issue with single variable Arrays came as a solution
//   Arrays have a Consecutive memory location pointed by one single variable
        int[] numArr=new int[3];//need to define the size first
        numArr[0]=12;
        numArr[1]=12;
        numArr[2]=12;
        System.out.println("Size of the numArr before increase "+numArr.length);
        int[] newBiggerArr=new int[4];//we can use loop to assign previouse array to knew array
        newBiggerArr[0]=numArr[0];
        newBiggerArr[1]=numArr[1];
        newBiggerArr[2]=numArr[2];
        newBiggerArr[3]=100;
        numArr=newBiggerArr;
String s="   ";

        System.out.println("size of numArr after increase "+numArr.length);

        System.out.println(Arrays.toString(numArr));//this method prints our array which we can't directly do with just printing array only shows the memory address



    }

}
