package com.MyNotes.TwoDArray;

public class GettingEvenRowsAndColums {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3,},
                {2, 5, 6},
                {1, 2, 2}
        };
        System.out.println("even rows and colums");
        for (int i = 0; i < array.length; i+=2) {

            for (int j = 0; j < array[i].length; j+=2) {
                System.out.println(array[i][j]);
            }
        }
        System.out.println("even elements");

        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                if (array[i][j]%2==0){
                    System.out.print(array[i][j]+" ");
                }
            }
        }
    }
}
