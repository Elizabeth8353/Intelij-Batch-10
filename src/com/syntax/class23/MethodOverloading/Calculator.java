package com.syntax.class23.MethodOverloading;

public class Calculator {
    void add(int num1,int num2){
        System.out.println(num1+num2);
    }
    void addDouble(double num1,double num2){
        System.out.println(num1+num2);
    }
    void addArray(int[] arr){
        int sum=0;
        for(int a:arr){
            sum+=a;
        }
        System.out.println(sum);
    }

}
