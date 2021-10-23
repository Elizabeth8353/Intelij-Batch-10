package com.syntax.class23.MethodOverloading;

public class ImproveCalculator {
    void add(int num1,int num2){

        System.out.println(num1+num2);
    }
//you can overload static, private final all can be overloaded not overwriten
    void add(double num1,double num2){

        System.out.println(num1+num2);
    }
    void add (int num1,double num2){

        System.out.println(num1+num2);
    }
    void add(double num1,int num2){
        System.out.println(num1+num2);
    }
    double add(double num1,float num2){
        return num1+num2;//not overload if change the return type
    }
    void add(int... arr){//var args variable arguments multiple arguments
        //can be acess as an array
        int sum=0;
        for(int a:arr){
            sum+=a;
        }
        System.out.println(sum);
    }


}
