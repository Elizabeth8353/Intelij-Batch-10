package com.syntax.class28.Tasks;

import java.util.Arrays;

public class Task1 {
    /*Write a method that takes an array and a number if number is present
    inside that array delete it now create a new array of lesser size copy
    elements and return it
     */
    public static void main(String[] args) {
        int[] arr={10,20,10,70,10};
        int number=10;
        System.out.println(Arrays.toString(remove(arr,number)));
    }
    public static int[] remove(int[] arr,int number){
        int counter=0;
        for (int j : arr) {//we are counting duplicate int number
            if (j == number) {
                counter++;//total 3
            }
        }
        int[] newArr=new int[arr.length-counter];//total array 5 - the 3duplicate number =2 / so we are creating new size 2 array
        int counter2=0;
        for (int j : arr) {
            if (j != number) {
                newArr[counter2] = j;
                counter2++;
            }
        }
        return newArr;
    }
  //  for (int i = 0; i <arr.length ; i++) {
  //      if(arr[i]!=number){              using for i to store in our new loop
   //         newArr[counter2]=arr[i];
   //         counter2++;
   //     }
   // }
}
