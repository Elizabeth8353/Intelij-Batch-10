package com.syntax.class23.HW2;

public class StaticOverload {
    /*Create 1 class with a static method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */

    static void print(boolean n){
        System.out.println(n);
    }
    static void print(int...a){
        for(int arr:a){
            if(arr%2==0){
                System.out.print(arr+" ");
            }
        }
        System.out.println();
    }

    static void print(String name,char grade){
        System.out.println(name+" "+grade);
    }

    public static void main(String[] args) {
        print(false);
        print(2,4,1,7,6);
        print("Elizabeth",'A');
    }
}
