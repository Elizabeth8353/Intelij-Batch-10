package com.syntax.class16;

public class InstanceDemo {
    int[] arr={10,20,30,50};
    int sum=0;
    void sum(){
      //  int sum=0; local will trump instant
        for(int i:arr){
            sum+=i;
        }
    }

    void calculatorAverage(){
        System.out.println(sum/arr.length);
    }
    static void hello(){
        System.out.println("Hello batch 10");
    }
}
