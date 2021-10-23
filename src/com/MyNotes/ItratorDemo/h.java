package com.MyNotes.ItratorDemo;

public class h {
    public static void main(String[] args) {
        int [] [] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
int [][] array = new int[0][];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                array[i][j]=arr[i][j]-10;
            }
            System.out.println();
        }

    }
}
