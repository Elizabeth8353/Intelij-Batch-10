package com.Review.class10;

public class Statistics {
    void add(double d1,double d2){
        System.out.println(d1+d2);
    }
    void add(double d1,double d2, double d3){
        System.out.println(d1+d2+d3);
    }
    void add(int i1,int i2){
        System.out.println(i1+i2);
    }
    void add(int[] arr){
        int sum=0;
        for(int num:arr){
            sum+=num;
        }
        System.out.println(sum);
    }

}
