package com.syntax.class23.MethodOverloading;

public class ImproveTester {
    public static void main(String[] args) {
        ImproveCalculator improveCalculator=new ImproveCalculator();
        int[] arr={5,2,3};
        improveCalculator.add(arr);
        //Google genetics
        improveCalculator.add(15,2,2,5,10,5);
    }
}
