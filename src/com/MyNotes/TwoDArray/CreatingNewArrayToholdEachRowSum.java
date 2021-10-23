package com.MyNotes.TwoDArray;

public class CreatingNewArrayToholdEachRowSum {
    public static void main(String[] args) {


        int[][] array = {{1, 2, 3,},
                {2, 5, 6},
                {1,2,2}
        };
        int[] newArray=new int[3];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum=0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            newArray[i]=sum;
        }
        System.out.println("========NewArrayHOlding Sum of each row====================");
        for (int a:newArray) {
            System.out.println(a);
        }
    }
}
