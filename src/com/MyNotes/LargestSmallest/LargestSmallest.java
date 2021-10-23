package com.MyNotes.LargestSmallest;

public class LargestSmallest {
    public static void main(String[] args) {

        int[] arr = {100,0,2, 5, 3, 1, 5, 4, -9};
        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<=smallest){
                smallest=arr[i];
            }
            if (arr[i]>largest){
                largest=arr[i];
            }

        }
        System.out.println("smallest is= "+smallest);
        System.out.println("Largest is= "+largest);
    }
}
