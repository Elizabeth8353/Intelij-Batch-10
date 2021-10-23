package com.MyNotes.LargestSmallest;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr={50,2,5,19,20,6};
        int largest=0;
        int secondLarge=0;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>largest) {//50 > 0 true ; 2>50 false; 5>50 false ;19>50 false;20>50 false;6>50 false
                secondLarge=largest;//0 , 2, 5, 19 // sec=0
                //System.out.print(secondLarge+" ");
                largest=arr[i];//2, 5, 19,20,//lar=50;
            } else if (arr[i]>secondLarge) {//we need this in case first number is largest//2>0 true; 5>2 true; 19>5 true;20>19 true;6>20 false
                secondLarge=arr[i];//2,5,19,20
            }
        }

       System.out.println(secondLarge);
    }
}
