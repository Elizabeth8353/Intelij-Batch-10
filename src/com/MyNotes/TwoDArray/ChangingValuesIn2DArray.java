package com.MyNotes.TwoDArray;

public class ChangingValuesIn2DArray {
    public static void main(String[] args) {
        int[][] a = {
                {1,2,3,4},
                {4,5,6,7},
                {1,3,5,7}
        };
        //create method reduce10 here
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=a[i][j]-10;   }
        }
        //print the elements from new array
        for (int[] arr : a) {
            for (int b : arr) {
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
}
